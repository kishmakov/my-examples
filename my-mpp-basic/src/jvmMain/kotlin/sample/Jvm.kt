package sample

actual class Common actual constructor() {
    actual fun getCode(): Int = 1543
}

actual object Platform {
    actual val name: String = "JVM"
}

actual fun currentLocation(): String = "nowhere"

fun greet(name: String): String {
    return "Hello, $name!"
}

fun main(args: Array<String>) {
    println(greet("JVM"))
    for (arg in args)
        println(greet(arg))
}