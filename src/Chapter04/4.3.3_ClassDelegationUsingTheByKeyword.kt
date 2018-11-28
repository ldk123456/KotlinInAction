package Chapter04.ClassDelegationUsingTheByKeyword

class CountingSet<T> (
        val innerSet: MutableCollection<T> = HashSet()
) : MutableCollection<T> by innerSet {  //将MutableCollection的实现委托给innerSet
    var objectsAdded = 0
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
    //>>>3 objects were added, 2 remain
}