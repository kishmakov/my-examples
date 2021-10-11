package com.example.my_studio

class Greeting {
    fun greeting(): String {
        val platform = Platform().platform
        val site = 12
        return "Hello, $platform $site!"
    }
}