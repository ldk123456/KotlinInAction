package Chapter05.PersonMap

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.map { it.name })
    //println(people.map(Person::name))     //成员引用
    //>>>[Alice, Bob]

    println(people.filter { it.age > 30 }.map { it.name })
    //>>>[Bob]

    val maxAge = people.maxBy { it.age }!!.age
    println(people.filter { it.age == maxAge })
    //>>>[Person(name=Bob, age=31)]
}