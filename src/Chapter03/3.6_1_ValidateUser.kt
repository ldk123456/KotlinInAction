package Chapter03.ex_3_6_1

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()){       //字段检查
        throw IllegalArgumentException(
            "Can't save user ${user.id}: Empty name"
        )
    }
    if (user.address.isEmpty()){        //字段检查
        throw IllegalArgumentException(
            "Can't save user ${user.id}: Empty address"
        )
    }

    //保存user到数据库
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
    //java.lang.IllegalArgumentException: Can't save user 1: Empty name
}