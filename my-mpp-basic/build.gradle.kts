buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.21"))
    }
}

plugins {
    kotlin("multiplatform") version "1.3.21"
}


repositories {
    mavenCentral()    
}

kotlin {
    macosX64("macos") {
        binaries {
            executable("main", listOf(RELEASE, DEBUG)) {
                compilation = compilations["main"]
                baseName = "mpp-basic"
                entryPoint = "demo.main"
                println("Executable path: ${outputFile.absolutePath}")
            }
        }
    }
}
