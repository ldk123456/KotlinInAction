package Chapter02

import Chapter02.Color                      //导入类，在同一个包内不需要导入
import Chapter02.Color.*                    //显式地导入枚举常量就可以使用它们的名称

fun getWarmth2(color: Color) =
        when (color){
            //使用导入的变量的名称
            RED, ORANGE, YELLOW -> "warm"
            GREEN -> "neutral"
            BLUE, INDIGO, VIOLET -> "cold"
        }

fun main(args: Array<String>) {
    println(getWarmth2(ORANGE))
    //>>>warm
}