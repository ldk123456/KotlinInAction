package Chapter04.AccessingABackingFieldFromAGetterOrSetter

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            //读取支持字段的值
            println("""
                Address was changed for $name:
                "$field" -> "$value"""".trimIndent()
            )
            //更新支持字段的值
            field = value
        }
}

fun main(args: Array<String>) {
    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
    /** 输出
     * Address was changed for Alice:
     * "unspecified" -> "Elsenheimerstrasse 47, 80687 Muenchen"
     */
}