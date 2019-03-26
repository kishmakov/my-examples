import sample.libcurl.CUrl

fun main(args: Array<String>) {
    val url = if (args.isEmpty()) "https://google.com" else args[0]
    println("Going to request $url")
    val myCurl = CUrl(url)
    myCurl.header += { println("Header: $it") }
    myCurl.body += { println("Body: $it") }
    myCurl.fetch()
    myCurl.close()
}