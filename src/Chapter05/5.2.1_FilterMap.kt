package Chapter05.FilterMap

fun main(args: Array<String>) {
    val map = mapOf(0 to "zero", 1 to "one")
    println(map.mapValues { it.value.toUpperCase() })
    //>>>{0=ZERO, 1=ONE}
}