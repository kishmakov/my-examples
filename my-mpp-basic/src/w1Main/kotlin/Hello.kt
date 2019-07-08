package sample.helloworld

fun hello(name: String): String {
    return "Hello, $name!"
}

fun main1(args: Array<String>) {
    println(hello("Kotlin/Native"))
    for (arg in args)
        println(hello(arg))
}

fun main2() {
    println(hello("James Smith"))
}
