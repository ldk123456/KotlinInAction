package Chapter05.LambdasAndCollections

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0      //存储最大年龄
    var theOldest: Person ?= null       //存储最大年龄的人
    for (person in people) {
        if (person.age > maxAge){
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)
    //>>>Person(name=Bob, age=31)
    println(people.maxBy { it.age })    //比较年龄找到最大的元素
}