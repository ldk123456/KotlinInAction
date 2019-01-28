package Chapter06.NullablePrimitiveTypes

data class Person(val name: String, val age: Int? = null) {
    fun isOlderThan(other: Person): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun main() {
    val p1 = Person("Sam", 35)
    val p2 = Person("Amy", 42)
    val p3 = Person("Jane")
    println(p1.isOlderThan(p2))
    //>>>false
    println(p1.isOlderThan(p3))
    //>>>null
}