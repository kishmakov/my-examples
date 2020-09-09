package sample

actual class Common actual constructor() {
    actual fun getCode(): Int = 57
}

actual object Platform {
    actual val name: String = "Windows"
}

actual fun currentLocation(): String = "nowhere"

fun greet(name: String): String {
    return "Hello, $name!"
}

fun main1(args: Array<String>) {
    println(greet("Kotlin/Native"))
    for (arg in args)
        println(greet(arg))
}

fun main2() {
    println(greet("James Smith"))
}