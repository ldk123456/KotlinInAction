package Chapter03

infix fun Any.to(other: Any) = Pair(this, other)

fun main(args: Array<String>) {
    //to: 中缀调用
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
    //>>>{1=one, 2=two, 3=three}
    for ((number, name) in map){
        println("$number, $name")
        /*
        >>>1, one
        >>>2, two
        >>>3, three
         */
    }
}