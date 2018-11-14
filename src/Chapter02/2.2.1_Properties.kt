package Chapter02

class Person(
    val name: String,           //只读属性：生成一个字段和一个简单的getter
    var isMarried: Boolean      //可写属性：一个字段，一个getter和一个setter
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)    //调用构造方法不需要关键字“new”
    //可以直接访问属性，但调用的是getter
    println(person.name)              //>>>Bob
    println(person.isMarried)         //>>>true
}
