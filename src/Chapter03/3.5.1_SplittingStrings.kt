package Chapter03

fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))      //显式地创建一个正则表达式
    //>>>[12, 345, 6, A]
    println("12.345-6.A".split(".", "-"))       //指定多个分隔符
    //>>>[12, 345, 6, A]
}