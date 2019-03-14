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
    macosX64("player") {
        compilations.getByName("main") {
            val ffmpeg by cinterops.creating {
                defFile(project.file("cinterop/ffmpeg.def"))
                includeDirs.headerFilterOnly("/opt/local/include", "/usr/local/include")
            }

            val sdl by cinterops.creating {
                defFile(project.file("cinterop/sdl.def"))
                includeDirs("/opt/local/include/SDL2", "/usr/local/include/SDL2")
            }
        }

        binaries {
            executable("player", listOf(RELEASE, DEBUG)) {
                compilation = compilations["main"]
                linkerOpts = mutableListOf("-L/opt/local/lib", "-L/usr/local/lib")
                baseName = "player"
                entryPoint = "sample.videoplayer.main"
                println("Executable path: ${outputFile.absolutePath}")
            }
        }
    }
}
