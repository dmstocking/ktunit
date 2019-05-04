plugins {
    kotlin("jvm") version "1.3.11"
}

group = "com.github.dmstocking"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
        maven {
            setUrl("https://dl.bintray.com/s1m0nw1/KtsRunner")
        }
    }
}
