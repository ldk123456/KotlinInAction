package Chapter07.DestructuringDeclarations

data class Point(val x: Int, val y: Int)

fun main() {
    val point = Point(10, 20)
    val (x, y) = point  //声明变量x、y，然后用p的组件来初始化
    println(x)  //>>>10
    println(y)  //>>>20
}