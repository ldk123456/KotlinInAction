package Chapter08.LookForAlice

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    for (person in people) {
        if (person.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")   //如果people中没有Alice，这一行就会被打印出来
}

fun main() {
    lookForAlice(people)
    //>>>Found!
}