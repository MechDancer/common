import com.novoda.gradle.release.PublishExtension

apply {
    plugin("com.novoda.bintray-release")
}

dependencies {
    implementation(project(":common-extension"))
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
    desc = "common collections"
    website = "https://github.com/MechDancer/common/$artifactId"
    issueTracker = "https://github.com/MechDancer/common/issues"
    repository = "https://github.com/MechDancer/common.git"
    setLicences("WTFPL")
}
