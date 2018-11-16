package Chapter03

/**
 * String: 接收者类型
 * this: 接收者对象
 */
//fun String.lastChar(): Char = this.get(this.length - 1)
//接收者对象成员可以不用this来访问
fun String.lastChar(): Char = get(length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    //>>>n
}