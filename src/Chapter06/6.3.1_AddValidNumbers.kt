package Chapter06.AddValidNumbers

import java.io.BufferedReader
import java.io.StringReader

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()      //创建包含可空null值的列表
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)      //向列表添加整数（非空值）
        }catch (e: NumberFormatException) {
            result.add(null)        //向列表添加null，因为当前行不能被解析成整数
        }
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for (number in numbers) {   //从列表中读取可空值
        if (number != null) {   //检查值是否为null
            sumOfValidNumbers += number
        }else{
            invalidNumbers++
        }
    }
    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}

fun addValidNumbers1(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}

fun main() {
    val reader = BufferedReader(StringReader("1\na\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
    addValidNumbers1(numbers)
    //>>>Sum of valid numbers: 43
    //>>>Invalid numbers: 1
}