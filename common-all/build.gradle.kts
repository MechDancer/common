import com.novoda.gradle.release.PublishExtension

apply {
    plugin("com.novoda.bintray-release")
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
}

task<Jar>("sourcesJar") {
    classifier = "sources"
    from(sourceSets["main"].allSource)
}

tasks.withType<Jar> {
    for (project in rootProject.subprojects) {
        from("${project.buildDir}/classes/kotlin/main")
    }
}

//task<Jar>("fatJar") {
//
//    classifier = "fatJar"
//    group = "build"
//
//    for (project in rootProject.subprojects) {
//        from("${project.buildDir}/classes/kotlin/main")
//        from(project.configurations.forEach {
//            try {
//                it.map {
//                    println(it)
//                    if (it.isDirectory) it else zipTree(it)
//                }
//            }catch (e:Exception){
//                e.printStackTrace()
//            }
//        })
//    }
//}

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