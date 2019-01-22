package Chapter05.NotAllAndAny

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(!list.all { it == 3 })  //！否定不明显，这种情况最好使用“any”
    //>>>true
    println(list.any { it != 3 })   //lambda函数中的条件要取反
    //>>>true
}