package Chapter07.BinaryOperators

data class Point(val x: Int, val y: Int)

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    val point = Point(10, 20)
    println(point * 1.5)
    //>>>Point(x=15, y=30)

    println('a' * 3)
    //>>>aaa

    println(0x0F and 0xF0)  //>>>0
    println(0x0F or 0xF0)   //>>>255
    println(0x1 shl 4)      //>>>16
}