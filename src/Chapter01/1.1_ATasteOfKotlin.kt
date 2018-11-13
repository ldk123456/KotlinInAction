package Chapter01

/**
 * 数据类
 */
data class Person(val name: String, val age: Int? = null)     // 可空类型（Int?）；实参默认值

/**
 * 顶层函数
 */
fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))  //命名参数
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
    //The oldest is: Person(name=Bob, age=29)          自动生成的toString方法
}