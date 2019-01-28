package Chapter06.LinkMultipleSafeCalls

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    val country = this.company?.address?.country    //多个安全调用链接在一起
    return country ?: "Unknown"
}

fun main() {
    val person = Person("Alice", null)
    println(person.countryName())
    //>>>Unknown
}