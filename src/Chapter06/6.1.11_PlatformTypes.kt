package Chapter06.PlatformTypes

class Person(val name: String?)

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}

fun main() {
    yellAtSafe(Person(null))
    //>>>ANYONE!!!
}