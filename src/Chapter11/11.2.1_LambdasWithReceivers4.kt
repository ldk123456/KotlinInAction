package Chapter11.LambdasWithReceivers4

fun main() {
    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two" }
    with (map) { this[3] = "three" }
    println(map)
    //>>>{1=one, 2=two, 3=three}
}