version = "v0.1.0"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":common-extension"))
    testImplementation("junit", "junit", "4.12")
}

task<Jar>("sourcesJar") {
    classifier = "sources"
    from(sourceSets["main"].allSource)
}
