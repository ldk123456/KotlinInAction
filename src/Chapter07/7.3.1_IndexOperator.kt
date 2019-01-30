package Chapter07.IndexOperator

data class MutablePoint(var x: Int, var y: Int)

//定义一个名为get的运算符函数
operator fun MutablePoint.get(index: Int): Int {
    return when(index) {
        //根据给出的index返回对应的坐标
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

//定义一个名为set的运算符函数
operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        //根据给出的index修改对应的坐标
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {
    var p = MutablePoint(10, 20)
    println(p[1])
    //>>>20

    p[1] = 42
    println(p)
    //>>>MutablePoint(x=10, y=42)
}