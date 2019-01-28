package Chapter06.ElvisOperator

fun strLenSafe(s: String?) = s?.length ?: 0

fun main() {
    println(strLenSafe("abc"))
    //>>>3
    println(strLenSafe(null))
    //>>>0
}