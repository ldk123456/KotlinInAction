package Chapter08.InliningCollectionOperations

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun main() {
    //使用lambda过滤
    println(people.filter { it.age < 30 })
    //手动过滤
    val result = mutableListOf<Person>()
    for (person in people) {
        if (person.age < 30) {
            result.add(person)
        }
    }
    println(result)
    //>>>[Person(name=Alice, age=29)]
}