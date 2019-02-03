package Chapter11.HtmlTags

open class Tag(val name: String) {
    private val children = mutableListOf<Tag>() //保存所有嵌套标签

    protected fun <T: Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)     //保存子标签的引用
    }

    override fun toString() = "<$name>${children.joinToString("")}</$name>" //返回HTML字符串
}

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

class TABLE: Tag("table") {
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)    //创建、初始化TR标签的示例并添加到TABLE的子标签中
}

class TR: Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init)    //添加TD标签的一个实例到TR的子标签中
}

class TD: Tag("td")

fun createTable() =
        table {
            tr {
                td {  }
            }
        }

fun createAnotherTable() =
        table {
            for (i in 1..2) {   //每一次调用tr都会创建一个新的TR标签实例，并将它添加到TABLE的子标签中
                tr {
                    td {  }
                }
            }
        }

fun main() {
    println(createTable())
    //>>><table><tr><td></td></tr></table>
    println(createAnotherTable())
    //>>><table><tr><td></td></tr><tr><td></td></tr></table>
}