package Chapter04.SealedClasses2

sealed class Expr {     //将基类标记为密封的...
    //...将所有可能的类作为嵌套类列出
    class Num(val value: Int): Expr()
    class Sum(val left: Expr, val right: Expr): Expr()
}

fun eval(e: Expr): Int =
        when (e) {  //when表达式涵盖了所有可能的情况，所以不再需要else分支
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.left) + eval(e.right)
        }

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
    //>>>7
}