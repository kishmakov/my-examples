package sample.helloworld

fun hello(n: Int): String =
    buildString {
	    append("Hello, Kotlin/Native @")
	    for (i in 0 .. n-1) {
            append("$n")
        }
	    append("@ Linux!")
    }


fun main1() {
    println(hello(1))
}

fun main2() {
    println(hello(2))
}
