inline fun <reified T> baz(value: T): String = "OK" + value

fun test(): String {
    val f: (Any) -> String = ::baz
    return f(1)
}

fun main() {
    println(test())
}