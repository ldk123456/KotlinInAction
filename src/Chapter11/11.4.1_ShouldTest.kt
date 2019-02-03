package Chapter11.ShouldTest

interface Matcher<T> {
    fun test(value: T)
}

class startWith(val prefix: String): Matcher<String> {
    override fun test(value: String) {
        if (!value.startsWith(prefix))
            throw AssertionError("String $value does not start with $prefix")
    }
}

infix fun <T> T.should(matcher: Matcher<T>) = matcher.test(this)

fun main() {
    "Kotlin" should startWith("Kot")
}