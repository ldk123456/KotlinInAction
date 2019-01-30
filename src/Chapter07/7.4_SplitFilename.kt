package Chapter07.SplitFilename

//声明一个数据类来持有值
data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1]) //返回一个数据类型的实例
}

fun main() {
    val (name, ext) = splitFileName("example.kt")   //使用解构声明来展开这个类
    println(name)   //>>>example
    println(ext)    //>>>kt
}