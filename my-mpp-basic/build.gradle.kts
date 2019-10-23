plugins {
    kotlin("multiplatform") version "1.3.60-eap-76"
}

repositories {
    jcenter()
    mavenCentral()
    gradlePluginPortal()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

kotlin {    
    macosX64("m1") {
        binaries {
            executable("e1") {
                entryPoint = "sample.helloworld.main1"
                runTask?.environment(
                        "Longitude" to "35.240197",
                        "Latitude" to "31.779402"
                )
                runTask?.args("Peter", "John", "James")
            }

            executable("e2") {
                entryPoint = "sample.helloworld.main2"
                runTask?.environment(
                        "Longitude" to "35.240197",
                        "Latitude" to "31.779402"
                )
                runTask?.args("Peter", "John", "James")
            }
        }
    }

    mingwX64("w1") {
        binaries {
            executable("e1") {
                entryPoint = "sample.helloworld.main1"
            }

            executable("e2") {
                entryPoint = "sample.helloworld.main2"
            }
        }
    }

    linuxX64("l1") {
        binaries {
            executable("e1") {
                entryPoint = "sample.helloworld.main1"
                runTask?.environment(
                        "Longitude" to "35.240197",
                        "Latitude" to "31.779402"
                )
                runTask?.args("Peter", "John", "James")
            }

            executable("e2") {
                entryPoint = "sample.helloworld.main2"
                runTask?.environment(
                        "Longitude" to "35.240197",
                        "Latitude" to "31.779402"
                )
                runTask?.args("Peter", "John", "James")
            }
        }
    }

    linuxX64("l2") {
        binaries {
            executable("e1") {
                entryPoint = "sample.helloworld.main1"
            }

            executable("e2") {
                entryPoint = "sample.helloworld.main2"
            }
        }
    }
}

