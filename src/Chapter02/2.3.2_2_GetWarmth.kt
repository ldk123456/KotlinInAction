package Chapter02

fun getWarmth(color: Color) =
        when (color){
            //在一个when分支上合并多个选项
            Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
            Color.GREEN -> "neutral"
            Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
        }

fun main(args: Array<String>) {
    println(getWarmth(Color.ORANGE))
    //>>>warm
}