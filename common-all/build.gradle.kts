import com.novoda.gradle.release.PublishExtension
import org.jetbrains.dokka.gradle.DokkaTask

apply {
    plugin("com.novoda.bintray-release")
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
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
}


configure<PublishExtension> {
    userOrg = "mechdancer"
    groupId = "org.mechdancer"
    artifactId = project.name
    publishVersion = version.toString()
    desc = "common utilities"
    website = extra["publishWebsite"].toString() + artifactId
    issueTracker = extra["publishIssueTracker"].toString()
    repository = extra["publishRepository"].toString()
    setLicences("WTFPL")
}