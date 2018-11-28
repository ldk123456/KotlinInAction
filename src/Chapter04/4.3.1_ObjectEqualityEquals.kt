package Chapter04.ObjectEqualityEquals

import Chapter04.StringRepresentationToString.Client

class Client(val name: String, val postalCode: Int) {
    //“Any”是java.lang.Object的模拟：Kotlin中所有类的父类。可控类型“Any?”意味着“other”可以为空
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Chapter04.ObjectEqualityEquals.Client)   //检查“other”是不是一个Client
            return false
        return name == other.name &&    //检查对应的属性是否相等
                postalCode == other.postalCode
    }

    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1 == client2) //在Kotlin中，==检查对象是否相等，而不是比较引用。这里会编译成调用“equals”
    //>>>false
    val client3 = Chapter04.ObjectEqualityEquals.Client("Alice", 342562)
    val client4 = Chapter04.ObjectEqualityEquals.Client("Alice", 342562)
    println(client3 == client4)
    //>>>true
}