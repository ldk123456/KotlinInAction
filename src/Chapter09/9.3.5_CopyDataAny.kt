package Chapter09.CopyDataAny

fun <T: R, R> copyData(source: MutableList<T>,  //来源的元素类型应该是目标元素类型的子类型
                 destination: MutableList<R>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems)    //可以调用这个函数，因为Int是Any的子类型
    println(anyItems)
    //>>>[1, 2, 3]
}