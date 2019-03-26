import java.nio.file.Paths

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin"))
    }
}

plugins {
    kotlin("multiplatform") version "1.3.30-eap-11"
    id("maven-publish")
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
}

allprojects {
    group = "org.jetbrains.kotlin.sample.native"
    version = "1.0"
}

val localRepo = rootProject.file("build/.m2-local")

publishing {
    repositories {
        maven { url = uri("file://$localRepo") }
    }
}

val cleanLocalRepo by tasks.creating(Delete::class) {
    delete(localRepo)
}

kotlin {
    macosX64("libcurl") {
        compilations.getByName("main") {
            val libcurl by cinterops.creating {
                defFile(project.file("cinterop/libcurl.def"))
                includeDirs.headerFilterOnly("/opt/local/include", "/usr/local/include")
            }
        }

        mavenPublication {
            pom {
                withXml {
                    val root = asNode()
                    root.appendNode("name", "libcurl interop library")
                    root.appendNode("description", "A library providing interoperability with host libcurl")
                }
            }
        }

        binaries {
            executable("kurl", listOf(RELEASE, DEBUG)) {
                compilation = compilations["main"]
                linkerOpts = mutableListOf("-L/opt/local/lib", "-L/usr/local/lib")
                baseName = "kurl"
                entryPoint = "main"
                println("Executable path: ${outputFile.absolutePath}")
            }
        }
    }
}