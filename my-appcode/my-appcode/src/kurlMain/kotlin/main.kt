import kotlinx.cinterop.*
import platform.Foundation.*
import sample.libcurl.CUrl

fun main(args: Array<String>) {
    autoreleasepool {
        val url = if (args.isEmpty()) "http://google.com" else args[0]
        NSLog("Going to request $url")
        val myCurl = CUrl(url)
        myCurl.header += { NSLog("Header: $it") }
        myCurl.body += { NSLog("Body: $it") }
        myCurl.fetch()
    }
}