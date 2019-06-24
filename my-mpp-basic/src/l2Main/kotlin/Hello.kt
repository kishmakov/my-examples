package sample.helloworld

fun hello(): String = "Hello, Kotlin/Native!"

fun bye(): String = "Bye, Kotlin/Native!"

fun main1() {
    println(hello())
    for (i in 0..2) {
        println(">>>")
    }
    println(bye())
}

fun main2() {
    println(hello())
    for (i in 0..2) {
        println("...")
    }
    println(bye())
}
