package Chapter02

import Chapter02.Color.*

fun mix(color1: Color, color2: Color) =
        /**
         * when表达式的实参可以是任何对象
         * 它被检查是否与分支条件相等
         */
        when (setOf(color1, color2)){
            //列举出能够混合的颜色对
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")      //如果没有任何其他分支匹配这里就会执行
        }

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
    //>>>GREEN
}