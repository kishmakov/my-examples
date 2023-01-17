plugins {
    kotlin("multiplatform") version "1.8.0"
}

repositories {
    mavenCentral()
    mavenLocal()
    google()
    gradlePluginPortal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        jvm().compilations["main"].defaultSourceSet {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }

        jvm().compilations["test"].defaultSourceSet {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
    }

    jvm("jvm") {
    }

    macosX64("macos1") {
        binaries {
            executable("e1") {
                entryPoint = "sample.main1"
                runTask?.environment(
                        "Longitude" to "35.240197",
                        "Latitude" to "31.779402"
                )
                runTask?.args("Peter", "John", "James")
            }

            executable("e2") {
                entryPoint = "sample.main2"
                runTask?.environment(
                        "Longitude" to "35.240197",
                        "Latitude" to "31.779402"
                )
                runTask?.args("Peter", "John", "James")
            }
        }
    }

    mingwX64("win1") {
        binaries {
            executable("e1") {
                entryPoint = "sample.main1"
            }

            executable("e2") {
                entryPoint = "sample.main2"
            }
        }
    }

    linuxX64("linux1") {
        binaries {
            executable("e1") {
                entryPoint = "sample.main1"
                runTask?.environment(
                        "Longitude" to "35.240197",
                        "Latitude" to "31.779402"
                )
                runTask?.args("Peter", "John", "James")
            }

            executable("e2") {
                entryPoint = "sample.main2"
                runTask?.environment(
                        "Longitude" to "35.240197",
                        "Latitude" to "31.779402"
                )
                runTask?.args("Peter", "John", "James")
            }
        }
    }

    linuxX64("linux2") {
        binaries {
            executable("e1") {
                entryPoint = "sample.main1"
            }

            executable("e2") {
                entryPoint = "sample.main2"
            }
        }
    }
}

