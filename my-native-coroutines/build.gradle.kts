buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.30-eap-11"))
    }
}

plugins {
    kotlin("multiplatform") version "1.3.30-eap-11"
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://dl.bintray.com/kotlin/kotlin-dev")    
}

kotlin {
    mingwX64("win") {
        binaries {
            executable("main", listOf(RELEASE, DEBUG)) {
                compilation = compilations["main"]
                baseName = "native-coroutines"
                entryPoint = "demo.main"
                println("Executable path: ${outputFile.absolutePath}")
            }
        }
    }

    sourceSets["commonMain"].dependencies {
        implementation("org.jetbrains.kotlinx:atomicfu-native:0.12.8")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-native:1.2.1")
    }
}
