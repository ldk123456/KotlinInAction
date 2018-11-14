package Chapter02

interface Expr

//简单的值对象类，只有一个属性value，实现了Expr接口
class Num(val value: Int): Expr
//Sum运算的实参可以是任何Expr：Num或者另一个Sum
class Sum(val left: Expr, val right: Expr): Expr

fun eval(expr: Expr): Int{
    //使用is检查判断一个变量是否是某种类型
    if (expr is Num){
        //val n = expr as Num             //显式地转换成类型Num是多余的
        return expr.value
    }
    if (expr is Sum){
        return eval(expr.left) + eval(expr.right)           //变量expr被智能地转换了类型
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    //>>>7
}