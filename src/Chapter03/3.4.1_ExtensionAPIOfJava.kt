package Chapter03

//源码
//fun <T> List<T>.last(): T { 返回最后一个元素 }
//public fun <T : Comparable<T>> Iterable<T>.max(): T? { 返回集合的最大值 }

fun main(args: Array<String>) {
    val strings: List<String> = listOf("first", "second", "third")
    println(strings.last())
    //>>>third

    val numbers: Collection<Int> = setOf(1, 14, 2)
    println(numbers.max())
    //>>>14
}