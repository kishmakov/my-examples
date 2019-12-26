package sample

actual class Sample actual constructor() {
    actual fun checkMe(): Int = 57
}

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

actual object Platform {
    actual val name: String = "Windows"
}