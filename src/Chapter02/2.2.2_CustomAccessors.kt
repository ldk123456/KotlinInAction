package Chapter02

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        /*get() {
            return height == width          //声明属性的getter
        }*/
        get() = height == width
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)         //>>>false
}