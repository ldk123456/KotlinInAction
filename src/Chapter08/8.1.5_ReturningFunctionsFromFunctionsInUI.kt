package Chapter08.ReturningFunctionsFromFunctionsInUI

data class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?
)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false
    fun getPredicate(): (Person) -> Boolean {   //声明一个返回函数的函数
        val startsWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber) {
            return startsWithPrefix     //返回一个函数类型的变量
        }
        return { startsWithPrefix(it) && it.phoneNumber != null }   //从这个函数返回一个lambda
    }
}

fun main() {
    val contacts = listOf(Person("Dmitry", "Jemerov", "123-4567"),
                            Person("Svetlana", "Isakova", null))
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters.getPredicate())) //将getPredicate返回的函数作为参数传递给filter函数
    //>>>[Person(firstName=Dmitry, lastName=Jemerov, phoneNumber=123-4567)]
}