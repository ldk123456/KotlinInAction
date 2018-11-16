package Chapter03.ex_3_6_4

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave(){
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saverUser(user: User){
    user.validateBeforeSave()

    //保存user到数据库
}

fun main(args: Array<String>) {
    saverUser(User(1, "", ""))
    //java.lang.IllegalArgumentException: Can't save user 1: empty Name
}