package Chapter03.ex_3_6_3
class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(value: String, filedName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save user ${user.id}: Empty $filedName"  //可以直接访问外部函数的参数
            )
        }
    }
    validate(user.name, "name")
    validate(user.address, "address")

    //保存user到数据库
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
    //java.lang.IllegalArgumentException: Can't save user 1: Empty name
}