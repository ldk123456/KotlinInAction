package Chapter06.NullableType

fun strLenSafe(s: String?): Int =
        if (s != null) s.length else 0      //增加了null检查后，这段代码就可以编译了

fun main() {
    val x: String? = null
    println(strLenSafe(x))
    //>>>0
    println(strLenSafe("abc"))
    //>>>3
}