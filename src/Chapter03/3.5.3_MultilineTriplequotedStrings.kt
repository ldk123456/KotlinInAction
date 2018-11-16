package Chapter03

val kotlinLogo = """| //
                   .|//
                   .|/ \"""

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin("."))
    /** 输出
     * | //
     * |//
     * |/ \
     */
}