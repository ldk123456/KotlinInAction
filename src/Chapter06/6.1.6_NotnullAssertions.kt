package Chapter06.NotnullAssertions

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!  //异常指向这一行
    println(sNotNull.length)
}
fun main() {
    ignoreNulls("abc")
    //>>>3
    ignoreNulls(null)
}