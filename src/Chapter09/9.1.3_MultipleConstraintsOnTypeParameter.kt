package Chapter09.MultipleConstraintsOnTypeParameter

fun <T> ensureTrailingPeriod(seq: T)
        where T: CharSequence, T: Appendable {
    if (!seq.endsWith('.')) {   //调用为CharSequence接口定义的扩展函数
        seq.append('.') //调用Appendable接口的方法
    }
}

fun main() {
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
    //>>>Hello World.
}