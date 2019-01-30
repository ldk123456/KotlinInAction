package Chapter07.RangePriority

import java.time.LocalDate

fun main() {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)    //创建一个从今天开始的10天的区间
    println(now.plusWeeks(1) in vacation)   //检测一个特定的日期是否属于这个区间
    //>>>true

    val n = 9
    println(0..(n + 1))     //可以写成0..n+1，但括起来更清晰一点
    //>>>0..10

    (0..n).forEach { print(it) }    //把区间括起来，来调用它的方法
    //>>>0123456789
}