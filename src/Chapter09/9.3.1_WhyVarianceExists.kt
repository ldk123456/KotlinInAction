package Chapter09.WhyVarianceExists

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun main() {
    printContents(listOf("abc", "bac"))
    //>>>abc, bac

    val strings = mutableListOf("abc", "bac")
    //addAnswer(strings)    //无法编译通过
    println(strings.maxBy { it.length })
}