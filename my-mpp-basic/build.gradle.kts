plugins {
    kotlin("multiplatform") version "1.3.40"
}

repositories {
    mavenCentral()
}

kotlin {
    macosX64("m1") {
        binaries {
            executable("e1") {
                entryPoint = "sample.helloworld.main1"
            }

            executable("e2") {
                entryPoint = "sample.helloworld.main2"
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
            }

            executable("e2") {
                entryPoint = "sample.helloworld.main2"
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

