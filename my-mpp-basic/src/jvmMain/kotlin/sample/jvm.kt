package sample

actual class Sample actual constructor() {
    actual fun checkMe(): Int = 1543
}

fun greet(name: String): String {
    return "Hello, $name!"
}

fun main(args: Array<String>) {
    println(greet("JVM"))
    for (arg in args)
        println(greet(arg))
}

actual object Platform {
    actual val name: String = "JVM"
}