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
    macosX64("mycos") {
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
        implementation("org.jetbrains.kotlinx:atomicfu-macos64:0.12.2-eap13")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-native_debug_macos_x64:1.1.1-eap13")
    }
}
