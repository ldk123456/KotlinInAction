package Chapter07.CompoundAssignmentOperators

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

fun main() {
    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)
    //>>>Point(x=4, y=6)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers)
    //>>>[42]

    val list = arrayListOf(1, 2)
    list += 3   //+=修改list
    val newList = list + listOf(4, 5)   //+返回一个包含所有元素的新列表
    println(list)   //>>>[1, 2, 3]
    println(newList)    //>>>[1, 2, 3, 4, 5]
}