package Chapter02

fun evalWhen(expr: Expr): Int =
        when (expr){
            //检查实参类型的when分支
            is Num -> expr.value                       //智能转换
            is Sum -> evalWhen(expr.left) + evalWhen(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(evalWhen(Sum(Num(1), Num(2))))
    //>>>3
}