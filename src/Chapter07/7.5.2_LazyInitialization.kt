package Chapter07.LazyInitialization

class Email { /*...*/ }
fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}

fun main() {
    val person = Person("Alice")
    person.emails   //第一次访问会加载邮件
    //>>>Load emails for Alice
    person.emails
}