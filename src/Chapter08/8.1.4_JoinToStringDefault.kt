package Chapter08.JoinToStringDefault

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: (T) -> String = { it.toString() }    //声明一个以lambda为默认值的函数类型的参数
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0){
            result.append(separator)
        }
        result.append(transform(element))   //调用作为实参传递给transform形参的函数
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