package Chapter06.ReadonlyAndMutableCollections

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source){       //在source集合中的所有元素中循环
        target.add(item)    //向可变的target集合中添加元素
    }
}

fun main() {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)
    //>>>[1, 3, 5, 7]
}