package Chapter05.SyntaxForLambdaExpressions

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))      //调用保存在变量中的lambda
    //>>>3

    /*{ println(42) }()       //直接调用lambda表达式
    //>>>42*/

    run { println(42) }         //运行lambda中的代码
    //>>>42
}