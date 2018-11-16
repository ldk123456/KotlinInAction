package Chapter03

/**
 * 为 Collection<T> 声明一个扩展函数
 */
fun <T> Collection<T>.joinToString(
        //为参数赋默认值
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()){     //this指向接收者对象：T的集合
        if (index > 0){
            result.append(separator)
        }
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/**
 * 只能由String集合来触发的扩展函数
 */
fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString(" "))
    //>>>1 2 3
    val strings = listOf("one", "two", "three")
    println(strings.join(" "))
    //>>>one two three
}