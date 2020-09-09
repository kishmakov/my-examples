package sample

actual class Common actual constructor() {
    actual fun getCode(): Int = 566
}

actual object Platform {
    actual val name: String = "Linux2"
}

actual fun currentLocation(): String = "nowhere"

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