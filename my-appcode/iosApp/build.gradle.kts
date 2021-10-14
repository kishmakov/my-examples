plugins {
//    id("org.jetbrains.gradle.apple.applePlugin") version "212.4638.14-0.13"
    id("org.jetbrains.gradle.apple.applePlugin") version "212.4638.14-0.14-dev-7"
}

apple {
    iosApp {
        productName = "myappcode"

        sceneDelegateClass = "SceneDelegate"
        launchStoryboard = "LaunchScreen"
        bridgingHeader = "iosApp-Bridging-Header.h"

        buildSettings.DEVELOPMENT_TEAM("9C3UR9CG82")

        //productInfo["NSAppTransportSecurity"] = mapOf("NSAllowsArbitraryLoads" to true)
        //buildSettings.OTHER_LDFLAGS("")

        dependencies {
            implementation(project(":shared"))
        }
    }
}
