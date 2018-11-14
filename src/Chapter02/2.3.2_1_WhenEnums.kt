package Chapter02

fun getMnemonic(color: Color) =              //直接返回一个“when”表达式
        when(color){
            //如果颜色和枚举变量相等，就返回对应的字符串
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    //>>>Battle
}