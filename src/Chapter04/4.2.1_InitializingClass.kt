package Chapter04.InitializingClass

class User(val nickname: String,
           val isSubscribed: Boolean = true)    //为构造方法参数提供一个默认值

fun main(args: Array<String>) {
    val alice = User("Alice")       //为isSubscribed参数使用默认值：true
    println(alice.isSubscribed)
    //>>>true
    val bob = User("Bob", false)    //可以按照声明顺序写明所有参数
    println(bob.isSubscribed)
    //>>>false
    val carol = User("Carol", isSubscribed = false)     //可以显式地为默写构造方法参数标明名称
    println(carol.isSubscribed)
    //>>>false
}