package Chapter09.PrintFirst

fun printFirst(list: List<*>) { //每一种列表都是可能的实参
    if (list.isNotEmpty()) {    //isNotEmpty()没有使用泛型类型参数
        println(list.first())   //first()返回的是Any?
    }
}

fun main() {
    printFirst(listOf("Svetlana", "Dmitry"))
    //>>>Svetlana
}