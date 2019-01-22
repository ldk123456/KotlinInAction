package Chapter05.UsingFunctionArgumentsInLambda

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {      //接受lambda作为实参，指定对每个元素的操作
        println("$prefix $it")      //在lambda中访问“prefix”参数
    }
}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")
    //>>>Error: 403 Forbidden
    //>>>Error: 404 Not Found
}