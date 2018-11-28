package Chapter04.CompanionObjects1

fun getFacebookName(accountId: Int) = "fb:$accountId"

/* 定义一个拥有多个从构造方法的类
class User {
    var nickname: String
    //从构造方法
    constructor(email: String) {
        nickname = email.substringBefore('@')
    }
    //从构造方法
    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }
}*/

class User private constructor(val nickname: String) {  //将主构造方法标记为私有
    companion object {  //声明伴生对象
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
        //用工厂方法通过Facebook账号来创建一个新用户
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)
}