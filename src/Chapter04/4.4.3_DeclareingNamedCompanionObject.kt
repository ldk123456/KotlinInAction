package Chapter04.DeclareingNamedCompanionObject

class Person(val name: String) {
    companion object Loader{
        fun fromJSON(jsonText: String) : Person =
            Person(jsonText.substringBeforeLast("'").substringAfterLast("'"))
    }
}

fun main(args: Array<String>) {
    //可以通过两种方式来调用fromJSON
    val person = Person.Loader.fromJSON("{name: 'Dmitry'}")
    println(person.name)
    //>>>Dmitry
    val person2 = Person.fromJSON("{name: 'Brent'}")
    println(person2.name)
    //>>>Brent
}