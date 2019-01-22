package Chapter05.Find

data class Person(val name: String, val age: Int)

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.find(canBeInClub27))
    //println(people.firstOrNull(canBeInClub27))
    //>>>Person(name=Alice, age=27)
}