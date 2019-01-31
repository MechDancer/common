import com.novoda.gradle.release.PublishExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

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

    from(sourceSets["main"].allSource)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-XXLanguage:+InlineClasses")
    }
}

configure<PublishExtension> {
    userOrg = "mechdancer"
    groupId = "org.mechdancer"
    artifactId = project.name
    publishVersion = version.toString()
    desc = "common extensions"
    website = "https://github.com/MechDancer/common/$artifactId"
    issueTracker = "https://github.com/MechDancer/common/issues"
    repository = "https://github.com/MechDancer/common.git"
    setLicences("WTFPL")
}