package Chapter02

import java.io.BufferedReader
import java.io.StringReader


fun readNumber1(reader: BufferedReader){
    val number =
            try {
                Integer.parseInt(reader.readLine())         //变成try表达式的值
            }catch (e: NumberFormatException){
                //return      //没有任何输出
                null            //输出null
            }
    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber1(reader)
}