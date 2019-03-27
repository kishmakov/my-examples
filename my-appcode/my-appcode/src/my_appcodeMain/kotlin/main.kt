import kotlinx.cinterop.*
import platform.Foundation.*
import sample.libcurl.pickAnUrl

fun main(args: Array<String>) {
    autoreleasepool {
        val anUrl = pickAnUrl(args)
        NSLog("See: $anUrl")
    }
}
