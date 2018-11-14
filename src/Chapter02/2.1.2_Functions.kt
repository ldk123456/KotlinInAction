package Chapter02

/**
 * max1: 函数名称
 * (a: Int, b: Int): 参数列表
 * Int: 返回类型
 */
fun max1(a: Int, b: Int): Int{
    return if (a > b) a else b  //函数体
}

/**
 * 表达式函数体
 */
fun max2(a: Int, b: Int): Int = if (a > b) a else b

/**
 * 只有表达式体函数的返回类型可以省略
 */
fun max3(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println("max(1, 2): ${max1(1, 2)}")   //>>>2
    println("max(3, 4): ${max2(3, 4)}")   //>>>4
    println("max(5, 6): ${max3(5, 6)}")   //>>>6
}