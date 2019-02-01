package Chapter08.SimpleFilter

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {   //调用作为参数传递给predicate的函数
            sb.append(element)
        }
    }
    return sb.toString()
}

fun main() {
    println("ab1c".filter { it in 'a'..'z' })   //传递一个lambda作为predicate参数
    //>>>abc
}