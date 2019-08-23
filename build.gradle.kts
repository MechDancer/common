import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:+")
        classpath("com.novoda:bintray-release:+")
    }
}

plugins {
    kotlin("jvm") version "1.3.41"
}

version = "0.1.0-3"

allprojects {
    apply {
        plugin("org.jetbrains.dokka")
        plugin("kotlin")
        plugin("java")
    }
    group = "cn.autolabor"
    repositories {
        mavenCentral()
        jcenter()
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions { jvmTarget = "1.8" }
    }
    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }
    tasks["jar"].dependsOn("sourcesJar")
}

subprojects {
    group = "org.mechdancer"
    version = rootProject.version

    dependencies {
        implementation(kotlin("stdlib-jdk8"))

        testImplementation("junit", "junit", "+")
        testImplementation(kotlin("test-junit"))
    }

    task<Jar>("javadocJar") {
        group = "build"
        archiveClassifier.set("javadoc")
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
    tasks["jar"].dependsOn("javadocJar")
    tasks["jar"].finalizedBy("copyArtifacts")
}
