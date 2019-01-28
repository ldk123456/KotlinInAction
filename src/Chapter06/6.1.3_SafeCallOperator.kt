package Chapter06.SafeCallOperator

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()     //allCaps可能是null
    println(allCaps)
}

fun main() {
    printAllCaps("abc")
    //>>>ABC
    printAllCaps(null)
    //>>>null
}