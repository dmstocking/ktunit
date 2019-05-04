import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

group = "com.github.dmstocking"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("compiler-embeddable"))
    implementation(kotlin("reflect"))
    implementation(kotlin("script-runtime"))
    implementation(kotlin("script-util"))
    implementation("de.swirtz:ktsRunner:0.0.x")
    implementation("org.slf4j:slf4j-api:1.7.14")
    implementation("ch.qos.logback:logback-classic:1.1.3")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}