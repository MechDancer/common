import com.novoda.gradle.release.PublishExtension

apply {
    plugin("com.novoda.bintray-release")
}

val slf4jVersion = "1.8.0-beta2"
val log4jVersion = "1.2.17"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":common-concurrent"))
    //interface
    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    //adapter
    implementation("org.slf4j:slf4j-log4j12:$slf4jVersion")
    //impl
    implementation("log4j:log4j:$log4jVersion")

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
    desc = "common extensions for log4j"
    website = extra["publishWebsite"].toString() + artifactId
    issueTracker = extra["publishIssueTracker"].toString()
    repository = extra["publishRepository"].toString()
    setLicences("WTFPL")
}