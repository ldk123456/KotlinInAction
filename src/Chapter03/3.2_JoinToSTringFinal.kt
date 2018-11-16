package Chapter03.ex_3_2_2

fun <T> joinToString(
        //带默认值的参数
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "(",
        postfix: String = ")"
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()){
        if (index > 0){
            result.append(separator)
        }
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
     val list = listOf(1, 2, 3)
    println(joinToString(list, ", ", "(", ")"))     //>>>(1, 2, 3)
    println(joinToString(list, "; "))               //>>>(1; 2; 3)
    println(joinToString(list))                 //>>>(1, 2, 3)
    println(joinToString(list, prefix = "#", postfix = ";"))        //>>>#1, 2, 3;
}