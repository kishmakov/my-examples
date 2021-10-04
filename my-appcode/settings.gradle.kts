pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        maven("https://repo.labs.intellij.net/mobile-ide-tmp/")
    }
    
}
rootProject.name = "my-appcode"


include(":iosApp")
include(":androidApp")
include(":shared")

