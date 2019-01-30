package Chapter07.OrderingOperators

class Person(val firstName: String, val lastName: String): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other,     //按顺序调用给定的方法，并比较它们的值
            Person::lastName, Person::firstName)
    }
}

fun main() {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)
    //>>>false

    println("abc" < "bac")
//>>>true
}