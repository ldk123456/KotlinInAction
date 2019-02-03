package Chapter11.LambdasWithReceivers3

val appendExcl: StringBuilder.() -> Unit =  //appendExcl是一个扩展函数类型的值
    { this.append("!") }

fun main() {
    val sb = StringBuilder("Hi")
    sb.appendExcl()     //可以像调用扩展函数一样调用appendExcl
    println(sb)
    //>>>Hi!
    println(buildString(appendExcl))    //也可以将appendExcl作为参数传递
    //>>>!
}