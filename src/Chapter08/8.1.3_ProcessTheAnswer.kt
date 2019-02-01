@file:JvmName("ProcessTheAnswer")
package Chapter08

/* Kotlin 声明 */
fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}