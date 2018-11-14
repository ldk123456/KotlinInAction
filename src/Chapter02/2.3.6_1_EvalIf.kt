package Chapter02

fun evalIf(expr: Expr): Int =
        if (expr is Num){
            expr.value
        }else if (expr is Sum){
            evalIf(expr.left) + evalIf(expr.right)
        }else {
            throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(evalIf(Sum(Num(1), Num(2))))
    //>>>3
}