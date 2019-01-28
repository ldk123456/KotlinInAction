package Chapter06.KotlinCollectionsAndJava

import Chapter06.CollectionUtils

// Kotlin
// collection.kt
fun printInUppercase(list: List<String>) {      //声明只读参数
    println(CollectionUtils.uppercaseAll(list))     //调用可以修改集合的Java函数
    println(list.first())       //打印被修改过的集合
}

fun main() {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
    //>>>[A, B, C]
    //>>>A
}