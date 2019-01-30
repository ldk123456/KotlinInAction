package Chapter07.PointPlusMember

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {    //定义一个名为plus的方法
        //坐标分别相加。然后返回一个新的点
        return Point(x +other.x, y + other.y)
    }
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)    //通过使用+号来调用plus方法
    //>>>Point(x=40, y=60)
}