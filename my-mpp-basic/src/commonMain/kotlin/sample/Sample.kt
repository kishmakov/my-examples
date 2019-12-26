package sample

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

fun hello(person: String): String {
    val title = "Mr. $person"
    val address = "Dear $title"
    val body = "we are glad to say you hello from ${Platform.name}"
    return listOf(address, body).joinToString(separator = ", ")
}

class Proxy {
    fun proxyHello(person: String) = hello(person)
}

fun main() {
    println(hello("John"))
}