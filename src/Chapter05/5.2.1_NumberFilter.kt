package Chapter05.NumberFilter

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })    //只保留偶数
    //>>>[2, 4]
}