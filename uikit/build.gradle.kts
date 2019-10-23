plugins {
    kotlin("multiplatform") version "1.3.50"
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

// If custom preset specified in "uikit.preset.name" property, then use it for building.
// Otherwise build for iPhone simulator (by default).
//fun determinePreset(): KotlinTargetPreset {
//    val presetName: String = if (project.hasProperty("uikit.preset.name"))
//        project.properties["uikit.preset.name"] as String
//    else
//        "iosX64"
//    val preset = project.kotlin.presets[presetName]
//    println("$project has been configured for $presetName platform.")
//    return preset
//}


val ios = kotlin.iosX64("ios") {
    binaries {
        executable {
            entryPoint = "sample.uikit.main"
        }
    }
}

// Special Gradle task that is called from Xcode.
// Two Gradle properties must be specified for this task:
// - uikit.configuration.name=[Release|Debug]
// - uikit.binary.location
val buildAppForXcode by tasks.creating {
    if (isCalledFromXcode()) {
        dependsOn(ios.binaries.getExecutable(getBuildTypeForXcode()).linkTask)
    }

    doLast {
        if (!isCalledFromXcode()) {
            throw Exception("Please run 'buildAppForXcode' task with all necessary properties!")
        }

        copy {
            from(file(ios.binaries.getExecutable(getBuildTypeForXcode()).outputFile))
            into(file(getBinaryLocationForXcode().parentFile))
            rename {
                getBinaryLocationForXcode().name
            }
        }
    }
}

fun isCalledFromXcode(): Boolean {
    return project.hasProperty("uikit.configuration.name") && project.hasProperty("uikit.binary.location")
}

fun getBuildTypeForXcode(): String {
    return project.properties["uikit.configuration.name"] as String
}

fun getBinaryLocationForXcode(): File {
    return file(project.properties["uikit.binary.location"]!!)
}
