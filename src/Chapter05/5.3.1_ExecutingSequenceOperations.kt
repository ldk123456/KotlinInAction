package Chapter05.ExecutingSequenceOperations

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()
    //>>>map(1) filter(1) map(2) filter(4) map(3) filter(9) map(4) filter(16)

    println(listOf(1, 2, 3, 4).asSequence().map { it * it }.find { it > 3 })
    //>>>4

    val people = listOf(Person("Alice", 29), Person("Bob", 31),
                        Person("Charles", 31), Person("Dan", 21))
    println(people.asSequence().map(Person::name).filter { it.length < 4 }.toList())    //先map后filter
    println(people.asSequence().filter { it.name.length < 4 }.map(Person::name).toList())   //先filter后map
    //>>>[Bob, Dan]
}