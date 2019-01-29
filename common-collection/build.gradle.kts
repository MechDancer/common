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
    artifactId = project.name
    publishVersion = version.toString()
    desc = "common collections"
    website = extra["publishWebsite"].toString() + artifactId
    issueTracker = extra["publishIssueTracker"].toString()
    repository = extra["publishRepository"].toString()
    setLicences("WTFPL")
}