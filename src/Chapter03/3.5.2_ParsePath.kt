package Chapter03

fun parsePathWithString(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, exc: $extension")
    //>>>Dir: /Users/a/kotlin-book, name: chapter, exc: doc
}

fun parsePathWithRegular(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, exc: $extension")
        //>>>Dir: /Users/a/kotlin-book, name: chapter, exc: doc
    }
}

fun main(args: Array<String>) {
    val path = "/Users/a/kotlin-book/chapter.doc"
    parsePathWithString(path)
    parsePathWithRegular(path)
}