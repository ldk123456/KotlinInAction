package Chapter04.StringRepresentationToString

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val client = Client("Alice", 342562)
    println(client)
    //>>>Client(name=Alice, postalCode=342562)
}