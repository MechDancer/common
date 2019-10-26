plugins {
    `maven-publish`
}


val slf4jVersion = "1.8.0-beta2"
val log4jVersion = "1.2.17"

dependencies {
    implementation(project(":common-concurrent"))
    implementation(kotlin("stdlib"))
    implementation("log4j", "log4j", log4jVersion)

    testImplementation("junit", "junit", "4.12")

}


val sources = tasks.register<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    from(sourceSets["main"].allSource)
}

val fat = tasks.register<Jar>("fatJar") {
    group = JavaBasePlugin.BUILD_TASK_NAME
    description = "Packs binary output with dependencies"
    archiveClassifier.set("all")
    from(sourceSets.main.get().output)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
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
        desc = "common extensions for log4j"
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