package Chapter06.Arrays

fun main(args: Array<String>) {
    for (i in args.indices) {   //使扩展属性array.indices在下标的范围内迭代
        println("Argument $i is: ${args[i]}")   //通过下标使用array[index]访问元素
    }

    val letters = Array(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))
    //>>>abcdefghijklmnopqrstuvwxyz

    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))     //期望vararg参数时使用展开运算符（*）传递数组
    //>>>a/b/c

    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(squares.joinToString())
    //>>>1, 4, 9, 16, 25

    args.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}