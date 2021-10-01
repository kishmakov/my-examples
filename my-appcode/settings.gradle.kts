pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
    
}
rootProject.name = "my-appcode"


include(":iosApp")
include(":androidApp")
include(":shared")

