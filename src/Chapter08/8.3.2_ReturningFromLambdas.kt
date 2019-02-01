package Chapter08.ReturningFromLambdas

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice"){
            return@forEach  //return@forEach从lambda表达式返回
        }
    }
    println("Alice might be somewhere")
}

fun main() {
    lookForAlice(people)
    //>>>Alice might be somewhere
}