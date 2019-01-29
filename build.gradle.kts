import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


buildscript {

    var kotlinVersion: String by extra
    var publishWebsite: String by extra

    kotlinVersion = "1.3.20"
    publishWebsite = "https://github.com/MechDancer/common/"

    extra.apply {
        this["publishIssueTracker"] = "$publishWebsite/issues"
        this["publishRepository"] = "$publishWebsite.git"
    }
    repositories {
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.17")
        classpath("com.novoda:bintray-release:+")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

version = "v0.1.0"

task<Delete>("clean") {
    group = "build"
    delete(rootProject.buildDir)
}

subprojects {
    group = "org.mechdancer"
    version = rootProject.version

    rootProject.extra.properties.forEach {
        if (it.key.contains("publish"))
            extra[it.key] = it.value
    }

    repositories {
        mavenCentral()
        jcenter()
    }

    apply {
        plugin("org.jetbrains.dokka")
        plugin("kotlin")
        plugin("java")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }

    task<Jar>("javadocJar") {
        group = "build"
        classifier = "javadoc"
        from("$buildDir/javadoc")
    }

    task<Copy>("copyArtifacts") {
        group = "build"
        from("$buildDir/libs")
        into("${rootProject.buildDir}/libs")
    }

    tasks.withType<DokkaTask> {
        outputFormat = "javadoc"
        outputDirectory = "$buildDir/javadoc"
    }

    tasks["javadoc"].dependsOn("dokka")
    tasks["jar"].dependsOn("sourcesJar")
    tasks["jar"].dependsOn("javadocJar")
    tasks["jar"].finalizedBy("copyArtifacts")

}
