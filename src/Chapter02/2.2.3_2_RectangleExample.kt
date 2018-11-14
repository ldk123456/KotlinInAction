package geometry.example

import geometry.shapes.createRandomRectangle            //Kotlin可直接导入函数名称

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
    //>>>false  (极少数会打印“true”，宽和高都是随机的)
}