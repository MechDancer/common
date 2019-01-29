import com.novoda.gradle.release.PublishExtension

apply {
    plugin("com.novoda.bintray-release")
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.slf4j:slf4j-api:1.8.0-beta2")     // 日志接口层
    implementation("org.slf4j:slf4j-log4j12:1.8.0-beta2") // 适配器
    implementation("log4j:log4j:1.2.17")                  // 本体

    implementation(project(":common-concurrent"))

    testImplementation("junit", "junit", "4.12")
}

task<Jar>("sourcesJar") {
    classifier = "sources"
    from(sourceSets["main"].allSource)
}

configure<PublishExtension> {
    userOrg = "mechdancer"
    groupId = "org.mechdancer"
    artifactId = "common-extension"
    publishVersion = version.toString()
    desc = "common extensions"
    website = "https://github.com/MechDancer/common/common-extension"
    issueTracker = "https://github.com/MechDancer/common"
    repository = "https://github.com/MechDancer/common.git"
    setLicences("WTFPL")
}
