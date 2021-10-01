package me.user.shared


class Greeting {
    fun greeting(): String {
        return "Hey, ${Platform().platform}!"
    }
}
