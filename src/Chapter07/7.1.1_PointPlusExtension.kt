package Chapter07.PointPlusExtension

data class Point(val x: Int, val y: Int)

//把运算符定义为扩展函数
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    //>>>Point(x=40, y=60)
}