import com.novoda.gradle.release.PublishExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


buildscript {
	repositories {
		mavenCentral()
		jcenter()
	}
	dependencies {
		classpath("org.jetbrains.dokka:dokka-gradle-plugin")
		classpath("com.novoda:bintray-release:+")
	}
}

plugins {
	kotlin("jvm") version "1.2.71"
	id("org.jetbrains.dokka") version "0.9.16"
}

apply {
	plugin("com.novoda.bintray-release")
}


group = "org.mechdancer"
version = "0.1.0"

repositories {
	mavenCentral()
}

dependencies {
	compile(kotlin("stdlib-jdk8"))
	compile(kotlin("reflect"))
}

tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "1.8"
}

configure<PublishExtension> {
	userOrg = "mechdancer"
	groupId = "org.mechdancer"
	artifactId = "common"
	publishVersion = version.toString()
	desc = "common util"
	website = "https://github.com/MechDancer/consoleparsere"
}