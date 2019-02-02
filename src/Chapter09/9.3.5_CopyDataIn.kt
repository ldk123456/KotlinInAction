package Chapter09.CopyDataIn

fun <T> copyData(source: MutableList<T>,
                 destination: MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems)
    println(anyItems)
    //>>>[1, 2, 3]
}