package Chapter02

import Chapter02.Color.*

fun mixOptimized(color1: Color, color2: Color) =
        when{                  //没有实参传给when
            (color1 == RED && color2 == YELLOW) || (color1 == YELLOW && color2 == RED)
            -> ORANGE
            (color1 == YELLOW && color2 ==BLUE) || (color1 == BLUE && color2 == YELLOW)
            -> GREEN
            (color1 == BLUE && color2 == VIOLET) || (color1 == VIOLET && color2 == BLUE)
            -> INDIGO
            else -> throw Exception("Dirty color")
        }

fun main(args: Array<String>) {
    println(mixOptimized(BLUE, YELLOW))
    //>>>GREEN
}