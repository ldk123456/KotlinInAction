package Chapter08.ThisWithLabel

fun main() {
    //这个lambda的隐式接收者可以通过this@sb访问
    println(StringBuilder().apply sb@{
        //this指向作用域内最近的隐式接收者
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString()) //所有隐式接收者都可以被访问，外层的接收者通过显式的标签访问
        }
    })
    //>>>[1, 2, 3]
}