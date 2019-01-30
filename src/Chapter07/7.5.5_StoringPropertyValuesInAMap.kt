package Chapter07.StoringPropertyValuesInAMap

class Person {
    private val _attributes = hashMapOf<String, String>()
    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }
    /*val name: String
        get() = _attributes["name"]!!   //从map中手动检索属性*/
    val name: String by _attributes     //把map作为委托属性
}

fun main() {
    val p = Person()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
    for ((attrName, value) in data) {
        p.setAttribute(attrName, value)
    }
    println(p.name)
    //>>>Dmitry
}