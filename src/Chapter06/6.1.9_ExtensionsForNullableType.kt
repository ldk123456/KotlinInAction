package Chapter06.ExtensionsForNullableType

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {    //这里不需要安全调用
        println("Please fill in the required fields")
    }
}

fun main() {
    verifyUserInput(" ")
    //>>>Please fill in the required fields
    verifyUserInput(null)   //这个接收者调用isNullOrBlank并不会导致任何异常
    //>>>Please fill in the required fields
}