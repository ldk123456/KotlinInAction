package Chapter05.NumberMap

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.map { it * it })
    //>>>[1, 4, 9, 16]
}