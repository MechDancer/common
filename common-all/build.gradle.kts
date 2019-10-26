import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    `maven-publish`
}


tasks.withType<DokkaTask> {
    outputFormat = "javadoc"
    outputDirectory = "$buildDir/javadoc"
    subProjects = rootProject
        .subprojects
        .filter { it !== project }
        .map { it.name }
}

val sources = tasks.register<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    rootProject.subprojects
        .filter { it !== project }
        .flatMap { it.sourceSets["main"].allSource.srcDirs }
        .filter { it.exists() && it.isDirectory }
        .forEach { from(it) }
}

val fat = tasks.register<Jar>("fatJar") {
    group = JavaBasePlugin.BUILD_TASK_NAME
    description = "Packs binary output with dependencies"
    archiveClassifier.set("all")
    from(tasks.jar)
    rootProject.subprojects
        .filter { it !== project }
        .flatMap { it.configurations.runtimeClasspath.get() }
        .filter { it.name.endsWith("jar") }
        .map { zipTree(it) }
        .forEach { from(it) }
}

tasks.jar.configure {
    rootProject.subprojects
        .filter { it !== project }
        .flatMap { it.sourceSets["main"].output }
        .filter { it.exists() && it.isDirectory }
        .forEach { from(it) }
}

val rename = tasks.register("renamePomFile") {
    dependsOn(tasks.publishToMavenLocal)
    doLast {
        val path = "${buildDir.absolutePath}/publications/maven/"
        val old = File(path + "pom-default.xml")
        val f = File("$path${project.name}-$version.pom")
        old.renameTo(f)
    }
}

tasks.bintrayUpload.configure {
    dependsOn(rename)
}

publishing {
    repositories {
        maven("$buildDir/repo")
    }

    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

bintray {
    user = "berberman"
    key = System.getenv("BintrayToken")
    setConfigurations("archives")
    val v = version.toString()
    val url = "https://github.com/MechDancer/common/"
    publish = true
    pkg.apply {
        name = project.name
        desc = "mechdancer common all in one"
        repo = "maven"
        userOrg = "mechdancer"
        githubRepo = "MechDancer/common"
        vcsUrl = "$url.git"
        issueTrackerUrl = "$url/issues"
        publicDownloadNumbers = true
        setLicenses("WTFPL")
        version.apply {
            name = v
            vcsTag = v
            websiteUrl = "$url/releases/tag/$v"
        }
    }
}

artifacts {
    add("archives", tasks.jar)
    add("archives", fat)
    add("archives", tasks["javadocJar"])
    add("archives", sources)
    add("archives", File("${buildDir.absolutePath}/publications/maven/${project.name}-$version.pom"))
}