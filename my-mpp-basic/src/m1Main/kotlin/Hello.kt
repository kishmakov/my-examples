package sample.helloworld

fun hello(name: String): String = "Hello, $name!"

fun main1() {
    println(hello("Kotlin/Native"))
}

fun main2() {
    println(hello("James Smith"))
}
