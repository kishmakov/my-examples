package me.user.shared

actual class Platform actual constructor() {
    actual var platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}