package Chapter09.TypeParameterConstraintFunctions

//这个函数的实参必须是可比较的元素
fun <T: Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun main() {
    println(max("Kotlin", "Java"))
    //>>>Kotlin
}