import kotlinx.cinterop.*
import platform.Foundation.*

fun main(args: Array<String>) {
    autoreleasepool {
        for (i in 1..9) {
            NSLog("${10 - i} ... ")
        }
        NSLog("Hello, World!")
    }
}
