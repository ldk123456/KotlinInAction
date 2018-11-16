package Chapter03

/**
 * vararg：可变参数修饰符
 * public fun <T> listOf(vararg elements: T): List<T>
 */
fun main(args: Array<String>) {
    val list = listOf("args: ", *args)      //展开运算符（*）展开数组内容
    println(list)
    //>>>[args: ]
}