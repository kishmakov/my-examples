package me.user.shared


import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual var platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}