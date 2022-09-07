package me.user.shared

private const val ITERATIONS = 10

class Greeting {

    var platform: String = "Ho-ho"
    var message = ""
    var n = 0

    fun greeting(): String {

        val pl = Platform()

//        message = "Hello, ${pl.platform}!"

//        println(">1>  ${pl.platform}")
            pl.platform = platform
//        println(">2>  ${pl.platform}")

        try {
            computeN()
        } catch (e: Error) {
            message = "Kotlin error: ${e.message} <-> " + message
        }

        return message
    }

    private fun computeN() {
        for (i in 0..ITERATIONS) {
            for (j in 0..ITERATIONS) {
                for (k in 0..ITERATIONS) {
                    cleanUp()
                    n = i +  j + k + 1
                }
            }
        }

        if (n > 2 * ITERATIONS) {
            throw Error("n is big")
        }
    }

    private fun cleanUp() {
        if (n > 0) n = 0
    }
}