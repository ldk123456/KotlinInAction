package Chapter03

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main(args: Array<String>) {
    //Kotlin的javaClass等价于Java的getClass()
    println(set.javaClass)          //>>>class java.util.HashSet
    println(list.javaClass)         //>>>class java.util.ArrayList
    println(map.javaClass)          //>>>class java.util.HashMap

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())         //>>>fourteenth

    val numbers = setOf(1, 14, 2)
    println(numbers.max())          //>>>14
    /* println()触发toString()的调用 */
    println(numbers)                //>>>[1, 14, 2]
}