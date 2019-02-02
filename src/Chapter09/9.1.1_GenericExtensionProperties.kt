package Chapter09.GenericExtensionProperties

val <T> List<T>.penultimate: T  //这个泛型扩展属性能在任何种类元素的列表上调用
    get() = this[size - 2]

fun main() {
    println(listOf(1, 2 ,3, 4).penultimate) //在这次调用中，类型参数T被推导为Int
    //>>>3
}