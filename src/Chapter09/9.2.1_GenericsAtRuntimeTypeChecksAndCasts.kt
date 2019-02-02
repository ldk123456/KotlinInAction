package Chapter09.GenericsAtRuntimeTypeChecksAndCasts

fun printSum1(c: Collection<*>) {
    val intList = c as? List<Int>   //这里会有警告：Unchecked cast: Collection<*> to List<Int>
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun printSum2(c: Collection<Int>) {
    if (c is List<Int>) {   //这次检查是合法的
        println(c.sum())
    }
}

fun main() {
    printSum1(listOf(1, 2, 3))
    //>>>6
    printSum1(setOf(1, 2, 3))   //Set不是列表，所有抛出了异常
    //>>>java.lang.IllegalArgumentException: List is expected
    printSum1(listOf("a", "b", "c"))    //类型转换成功，但后面抛出了另外的异常
    //>>>java.lang.ClassCastException: String cannot be cast to Number

    printSum2(listOf(1, 2, 3))
    //>>>6
}