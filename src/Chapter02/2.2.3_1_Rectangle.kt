package geometry.shapes

import java.util.Random             //导入标准Java库的类

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle{
    var random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

