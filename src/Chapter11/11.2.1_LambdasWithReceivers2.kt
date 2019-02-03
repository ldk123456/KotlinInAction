package Chapter11.LambdasWithReceivers2

fun buildString(
    builderAction: StringBuilder.() -> Unit //定义带接收者的函数类型的参数
): String {
    val sb = StringBuilder()
    sb.builderAction()  //传递一个StringBuilder实例作为lambda的接收者
    return sb.toString()
}

fun main() {
    val s = buildString {
        this.append("Hello, ")  //用this关键字指向StringBuilder实例
        append("World!")    //也可以省略this，隐式地引用StringBuilder
    }
    println(s)
    //>>>Hello, World!
}