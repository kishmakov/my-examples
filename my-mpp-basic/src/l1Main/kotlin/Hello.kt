package sample.helloworld

fun hello(n: Int): String =
    buildString {
	    append("Hello, Kotlin/Native @")
	    for (i in 0 .. n-1) {
            append("$n")
        }
	    append("@ Linux!")
    }


fun main1(args: Array<String>) {
    println(hello(1))
    for (arg in args) {
        println(arg)
    }
}

fun main2(args: Array<String>) {
    println(hello(2))
    for (arg in args) {
        println(arg)
    }
}
