package Chapter04.ExtensionFunctionForCompanionObject

class Person(val firstName: String, val lastName: String) {
    companion object {}     //声明一个空的伴生对象
}

/*fun Person.Companion.fromJSON(json: String) : Person {  //声明一个扩展函数
    ...
}*/

fun main(args: Array<String>) {
    //val p = Person.fromJSON(json)
}