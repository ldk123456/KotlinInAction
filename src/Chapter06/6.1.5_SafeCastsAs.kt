package Chapter06.SafeCastsAs

class Person(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        //检查类型，如果不匹配就返回false
        val otherPerson = other as? Person ?: return false
        //在安全转换之后，变量otherPerson被智能地转换为Person类型
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val person1 = Person("Dmitry", "Jemerov")
    val person2 = Person("Dmitry", "Jemerov")
    println(person1 == person2)     //==运算符会调用equals方法
    //>>>true
    println(person1.equals(42))
    //>>>false
}