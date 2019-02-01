package Chapter08.DefaultAndNullValuesForParametersWithFunctionTypes

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: ((T) -> String)? = null  //声明一个函数类型的可空参数
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        val str = transform?.invoke(element)    //使用安全调用语法调用函数
                ?: element.toString()   //使用Elvis运算符处理回调没有被指定的情况
        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString()) //使用默认的转换函数
    //>>>Alpha, Beta
    println(letters.joinToString { it.toLowerCase() })  //传递一个lambda作为参数
    //>>>alpha, beta
    println(letters.joinToString(separator = "! ", postfix = "! ",
        transform = { it.toUpperCase() }))  //使用命名参数语法传递几个参数，包括一个lambda
    //>>>ALPHA! BETA!
}