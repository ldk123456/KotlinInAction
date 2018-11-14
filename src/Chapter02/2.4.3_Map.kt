package Chapter02

import java.util.*

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()        //使用TreeMap让键排序
    for (c in 'A'..'F'){        //使用字符区间迭代A到F之间的字符
        val binary = Integer.toBinaryString(c.toInt())      //把ASCII码转换成二进制
        binaryReps[c] = binary      //根据键c把值存储到map中
    }
    for ((letter, binary) in binaryReps){       //迭代map，把键和值赋给两个变量
        println("$letter = $binary")
        /*
        >>>A = 1000001
        >>>B = 1000010
        >>>C = 1000011
        >>>D = 1000100
        >>>E = 1000101
        >>>F = 1000110
         */
    }
}