import com.novoda.gradle.release.PublishExtension

apply {
    plugin("com.novoda.bintray-release")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":common-extension"))
    testImplementation("junit", "junit", "4.12")
}

task<Jar>("sourcesJar") {
    classifier = "sources"
    from(sourceSets["main"].allSource)
}

configure<PublishExtension> {
    userOrg = "mechdancer"
    groupId = "org.mechdancer"
    artifactId = "common-concurrent"
    publishVersion = version.toString()
    desc = "common concurrent utilities"
    website = "https://github.com/MechDancer/common/common-concurrent"
    issueTracker = "https://github.com/MechDancer/common"
    repository = "https://github.com/MechDancer/common.git"
    setLicences("WTFPL")
}