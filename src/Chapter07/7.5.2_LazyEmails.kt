package Chapter07.LazyEmails

class Email { /*...*/ }
fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person(val name: String) {
    private var _emails: List<Email>? = null    //_emails属性用来保存数据，关联委托
    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)  //访问时加载邮件
            }
            return _emails!!    //如果已经加载，就直接返回
        }
}

fun main() {
    val person = Person("Alice")
    person.emails   //第一次访问会加载邮件
    //>>>Load emails for Alice
    person.emails
}