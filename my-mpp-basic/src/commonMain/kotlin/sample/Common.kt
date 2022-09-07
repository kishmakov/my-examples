package sample

expect class Common() {
    fun getCode(): Int
}

expect object Platform {
    val name: String
}

fun checkNames(names: Array<String>) {
    if (names.isEmpty()) {
        throw Error("Jude")
    }
}

fun question(subject: String, names: Array<String> = emptyArray()): String {
    return buildString {
        append("$subject?")
        for (name in names) {
            append(" $name?")
        }

        try {
            checkNames(names)
        } catch (e: Error) {
            append(" ${e.message}?")
        }
    }
}

expect fun currentLocation(): String

fun hello(person: String): String {
    val title = "Mr. $person"
    val address = "Dear $title"
    val body = "we are glad to say you hello from ${Platform.name}"
    return listOf(address, body).joinToString(separator = ", ")
}


class Proxy {
    fun proxyHello(person: String) = hello(person)
}