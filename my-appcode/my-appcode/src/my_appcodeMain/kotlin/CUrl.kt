package sample.libcurl

fun pickAnUrl(args: Array<String>): String {
    val i = args.size + 10
    val ii = i * (i + 1) + 2
    return if (ii > 112) args[0] else "https://google.com"
}