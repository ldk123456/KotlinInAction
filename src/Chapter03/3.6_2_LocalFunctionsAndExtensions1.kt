package Chapter03.ex_3_6_2

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    //声明一个局部函数来验证所有字段
    fun validate(user: User,
                 value: String,
                 filedName: String) {
        if (value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save user ${user.id}: Empty $filedName"
            )
        }
    }

    //调用局部函数来验证特定字段
    validate(user, user.name, "name")
    validate(user, user.address, "address")

    //保存user到数据库
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
    //java.lang.IllegalArgumentException: Can't save user 1: Empty name
}