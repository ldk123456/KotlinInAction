package Chapter05.ReferencingTopLevelFunction

fun salute() = println("Salute!")

fun main(args: Array<String>) {
    run(::salute)       //引用顶层函数
    //>>>Salute!
}