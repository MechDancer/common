import com.novoda.gradle.release.PublishExtension

apply {
    plugin("com.novoda.bintray-release")
}

val slf4jVersion = "1.8.0-beta2"
val log4jVersion = "1.2.17"

dependencies {
    implementation(project(":common-concurrent"))

    implementation("log4j", "log4j", log4jVersion)
}

task<Jar>("sourcesJar") {
    classifier = "sources"
    group = "build"

    from(sourceSets["main"].allSource)
}

configure<PublishExtension> {
    userOrg = "mechdancer"
    groupId = "org.mechdancer"
    artifactId = project.name
    publishVersion = version.toString()
    desc = "common extensions for log4j"
    website = "https://github.com/MechDancer/common/$artifactId"
    issueTracker = "https://github.com/MechDancer/common/issues"
    repository = "https://github.com/MechDancer/common.git"
    setLicences("WTFPL")
}
