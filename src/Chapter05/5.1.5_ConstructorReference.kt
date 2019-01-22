package Chapter05.ConstructorReference

data class Person(val name: String, val age: Int)

fun Person.isAdult() = age >= 21

fun main(args: Array<String>) {
    val createPerson = ::Person     //创建“Person”实例的动作被保存成了值
    val p = createPerson("Alice", 29)
    println(p)
    //>>>Person(name=Alice, age=29)

    //引用扩展函数
    val predicate = Person::isAdult
    println(predicate(p))
    //true
    val personAgeFunction = p::age      //绑定成员引用
    println(personAgeFunction())
    //>>>29
}