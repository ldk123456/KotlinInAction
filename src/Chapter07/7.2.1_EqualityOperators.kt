package Chapter07.EqualityOperators

class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean { //重写在Any中定义的方法
        if (other === this)     //优化：检查参数是否与this是同一个对象
            return true
        if (other !is Point)    //检查参数类型
            return false
        return x == other.x && y == other.y     //智能转换为Point来访问x，y属性
    }
}

fun main() {
    println(Point(10, 20) == Point(10, 20))     //>>>true
    println(Point(10, 20) != Point(5, 5))       //>>>true
    println(null == Point(1, 2))        //>>>false
}