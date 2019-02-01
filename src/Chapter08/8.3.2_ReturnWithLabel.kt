package Chapter08.ReturnWithLabel

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    people.forEach label@{  //给lambda表达式加上标签
        if (it.name == "Alice"){
            return@label    //return@label引用了这个标签
        }
    }
    println("Alice might be somewhere") //这一行总是会被打印出来
}

fun main() {
    lookForAlice(people)
    //>>>Alice might be somewhere
}