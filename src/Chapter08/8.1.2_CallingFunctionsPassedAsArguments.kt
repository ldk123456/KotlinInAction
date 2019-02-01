package Chapter08.CallingFunctionsPassedAsArguments

fun twoAndThree(operation: (Int, Int) -> Int) { //定义一个函数类型的参数
    val result = operation(2, 3)    //调用函数类型的参数
    println("The result is $result")
}

fun main() {
    twoAndThree {a, b -> a + b}
    //>>>The result is 5
    twoAndThree { a, b -> a * b }
    //>>>The result is 6
}