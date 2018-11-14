package Chapter02

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int?{           //不必显式地指定这个函数可能抛出的异常
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch (e: NumberFormatException){          //异常类型在右边
        return null
    }
    finally {           //finally的作用和Java中一样
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
    //>>>239
}