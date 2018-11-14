package Chapter02

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")           //>>>Hello, Kotlin!
    //如果把“Bob”作为实参传进来，打印的就是“Hello，Bob”

    if (args.size > 0){    //false
        println("Hello, ${args[0]}")   //使用${}的语法插入args数组中的第一个元素
    }

    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
    //>>>Hello, someone!
}