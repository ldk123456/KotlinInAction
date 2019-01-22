package Chapter05.ChangingLocalVariablesInLambda

fun printProblemCounts(responses: Collection<String>) {
    //声明将在lambda内部访问的变量
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")){
            clientErrors++  //在lambda中修改变量
        }else if (it.startsWith("5")){
            serverErrors++  //在lambda中修改变量
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

fun main(args: Array<String>) {
    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
    //>>>1 client errors, 1 server errors
}