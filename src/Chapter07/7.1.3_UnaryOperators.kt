package Chapter07.UnaryOperators

import java.math.BigDecimal

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus(): Point {    //一元运算符无参数
    return Point(-x, -y)    //坐标取反，然后返回
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    val point = Point(10, 20)
    println(-point)
    //>>>Point(x=-10, y=-20)

    var bd = BigDecimal.ZERO
    println(bd++)   //>>>0
    println(++bd)   //>>>2
}