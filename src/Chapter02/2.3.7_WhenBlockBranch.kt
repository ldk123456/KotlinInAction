package Chapter02

fun evalWithLogging(expr: Expr) : Int =
        when (expr){
            //代码块中最后的表达式就是结果
            is Num -> {
                println("num: ${expr.value}")
                expr.value                      //如果expr的类型是Num就会返回它
            }
            is Sum -> {
                val left = evalWithLogging(expr.left)
                val right = evalWithLogging(expr.right)
                println("sum: $left + $right")
                left + right                    //如果expr的类型是Sum就会返回这个表达式
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
    /*
    >>>num: 1
    >>>num: 2
    >>>sum: 1 + 2
    >>>num: 4
    >>>sum: 3 + 4
    >>>7
     */
}