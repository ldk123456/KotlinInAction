package Chapter04.CompanionObjects

class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()
    //>>>Companion object called
}