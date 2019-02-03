package Chapter11.LambdasWithReceivers1

fun buildString(
    builderAction: (StringBuilder) -> Unit  //定义一个函数类型的参数
): String {
    val sb = StringBuilder()
    builderAction(sb)   //传递一个StringBuilder对象作为lambda的参数
    return sb.toString()
}

fun main() {
    val s = buildString {
        it.append("Hello, ")    //使用it指向StringBuilder实例
        it.append("World!")
    }
    println(s)
    //>>>Hello, World!
}