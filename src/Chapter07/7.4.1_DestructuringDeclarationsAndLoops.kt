package Chapter07.DestructuringDeclarationsAndLoops

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {     //在in循环中哟用解构声明
        println("$key -> $value")
    }
}

fun main() {
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
    //>>>Oracle -> Java
    //>>>JetBrains -> Kotlin

}