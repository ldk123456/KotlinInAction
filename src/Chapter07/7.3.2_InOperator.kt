package Chapter07.InOperator

data class Point(val x: Int, val y: Int)

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&     //使用until函数来构建一个开区间
            p.y in upperLeft.y until lowerRight.y   //构建一个区间，检查坐标x，y是否属于这个区间
}

fun main() {
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)  //true
    println(Point(5, 5) in rect)    //false
}