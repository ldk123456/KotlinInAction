package Chapter06.NothingType

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    fail("Error occurred")
    //>>>java.lang.IllegalStateException: Error occurred
}