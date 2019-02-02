package Chapter09.GenericFunctionsAndProperties

fun main() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))  //显式地指定类型参数
    //>>>[a, b, c]
    println(letters.slice(10..13))  //编译器推导出这里的T是Char
    //>>>[k, l, m, n]
}