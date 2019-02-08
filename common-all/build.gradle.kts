import com.novoda.gradle.release.PublishExtension
import org.jetbrains.dokka.gradle.DokkaTask

apply {
    plugin("com.novoda.bintray-release")
}

task<Jar>("sourcesJar") {
    classifier = "sources"
    group = "build"

    rootProject.subprojects
        .filter { it !== project }
        .flatMap { it.sourceSets["main"].allSource.srcDirs }
        .filter { it.exists() && it.isDirectory }
        .forEach { from(it) }
}


tasks.getByName<Jar>("jar") {
    for (project in rootProject.subprojects) {
        from("${project.buildDir}/classes/kotlin/main")
    }
}


tasks.withType<DokkaTask> {
    sourceDirs =
        rootProject.subprojects
            .filter { it !== project }
            .flatMap { it.sourceSets["main"].allSource.srcDirs }
}

task<DokkaTask>("website") {
    outputFormat = "jekyll"
    sourceDirs =
        rootProject.subprojects
            .filter { it !== project }
            .flatMap { it.sourceSets["main"].allSource.srcDirs }
    outputDirectory = "$rootDir/docs"
    finalizedBy("createJekyllConfig")
}

task("createJekyllConfig") {
    group = "documentation"
    doLast {
        File("$rootDir/docs/_config.yml")
            .also { it.createNewFile() }
            .appendText("theme: jekyll-theme-hacker")
    }
}


configure<PublishExtension> {
    userOrg = "mechdancer"
    groupId = "org.mechdancer"
    artifactId = project.name
    publishVersion = version.toString()
    desc = "mechdancer common all in one"
    website = "https://github.com/MechDancer/common/$artifactId"
    issueTracker = "https://github.com/MechDancer/common/issues"
    repository = "https://github.com/MechDancer/common.git"
    setLicences("WTFPL")
}
