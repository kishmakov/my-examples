package sample

actual class Sample actual constructor() {
    actual fun checkMe(): Int = 566
}

fun bye(): String = "Bye, Kotlin/Native!"

fun main1() {
    println(hello("Ivan"))
    for (i in 0..2) {
        println(">>>")
    }
    println(bye())
}

fun main2() {
    println(hello("John"))
    for (i in 0..2) {
        println("...")
    }
    println(bye())
}

actual object Platform {
    actual val name: String = "Linux2"
}