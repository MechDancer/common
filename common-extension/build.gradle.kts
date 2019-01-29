import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

version = "v0.1.0"

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
}

task<Jar>("sourcesJar") {
    classifier = "sources"
    from(sourceSets["main"].allSource)
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    freeCompilerArgs = listOf("-XXLanguage:+InlineClasses")
}