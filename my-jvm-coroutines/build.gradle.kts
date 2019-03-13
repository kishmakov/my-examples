buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.21"))
    }
}

plugins {
    application
    kotlin("jvm") version "1.3.21"
}

application {
    mainClassName = "demo.MainKt"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compile(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.1.1")

    testCompile("junit:junit:4.11")
    testCompile(kotlin("test-junit"))
}


