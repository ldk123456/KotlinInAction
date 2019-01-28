package Chapter06.NumberConversions

fun foo(l: Long) = println(l)

fun main() {
    val x = 1
    println(x.toLong() in listOf(1L, 2L, 3L))
    //>>>true
    val b: Byte = 1     //常量有正确的类型
    val l = b + 1L      //+可以进行字节类型和长整型参数的计算
    foo(42)           //编译器认为42是一个长整型
    //>>>42
    println("42".toInt())
    //>>>42
}