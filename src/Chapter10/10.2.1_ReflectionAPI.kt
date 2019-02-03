package Chapter10.ReflectionAPI

import kotlin.reflect.KFunction
import kotlin.reflect.full.memberProperties

class Person(val name: String, val age: Int)

fun foo(x: Int) = println(x)

fun sum(x: Int, y: Int) = x + y

var counter = 0

fun main() {
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin    //返回一个KClass<Person>的实例
    println(kClass.simpleName)
    //>>>Person
    kClass.memberProperties.forEach { println(it.name) }
    //>>>age
    //>>>name

    val kFunction = ::foo
    kFunction.call(42)
    //>>>42

    val kFunction1 = ::sum
    println(kFunction1.invoke(1, 2) + kFunction1(3, 4))
    //>>>10

    val kProperty = ::counter
    kProperty.setter.call(21)   //通过反射调用setter，把21作为实参传递
    println(kProperty.get())    //通过调用get获取属性的值
    //>>>21

    val memberProperty =  Person::age
    println(memberProperty.get(person))
    //>>>29
}