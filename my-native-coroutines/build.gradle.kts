plugins {
    kotlin("multiplatform") version "1.3.30-eap-11"
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    maven("https://dl.bintray.com/kotlin/kotlinx")
    maven("https://dl.bintray.com/qwwdfsad/kotlinx/")
}

kotlin {    
    macosX64("HelloWorld") {
        binaries {            
            executable("HelloWorldApp") {                
                entryPoint = "demo.main"
            }
        }
    }

    sourceSets["commonMain"].dependencies {
        implementation("org.jetbrains.kotlinx:atomicfu-macos64:0.12.2-eap13")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-native_debug_macos_x64:1.1.1-eap13")
    }
}
