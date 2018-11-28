package Chapter04.ImplementingPropertiesDeclaredInterface

interface User {
    val nickname: String
}

interface User1 {
    val email: String
    val nickname: String        //属性没有支持的字段：结果值在每次访问时通过计算得到
        get() = email.substringBefore('@')
}

class PrivateUser(override val nickname: String) : User     //主构造方法属性

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')      //自定义getter
}

fun getFacebookName(accountId: Int) = "fb:$accountId"

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)      //属性初始化
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    //>>>test@kotlinlang.org
    println(SubscribingUser("test@kotlinlang.org").nickname)
    //>>>test
}