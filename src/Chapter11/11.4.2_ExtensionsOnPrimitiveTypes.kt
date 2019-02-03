package Chapter11.ExtensionsOnPrimitiveTypes

import java.time.LocalDate
import java.time.Period

val Int.days: Period
    get() = Period.ofDays(this)

val Period.ago: LocalDate
    get() = LocalDate.now() - this

val Period.fromNow: LocalDate
    get() = LocalDate.now() + this

fun main() {
    println(1.days.ago)
    //>>>2019-02-02
    println(1.days.fromNow)
    //>>>2019-02-04
}