package Chapter09.TypeParameterConstraints

fun <T: Number> oneHalf(value: T): Double { //指定Number为类型形参的上界
    return value.toDouble() / 2.0   //调用Number类中的方法
}

fun main() {
    println(listOf(1, 2, 3, 4).sum())
    //>>>10

    println(oneHalf(3))
    //>>>1.5
}