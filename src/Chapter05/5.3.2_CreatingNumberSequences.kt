package Chapter05.CreatingNumberSequences

fun main(args: Array<String>) {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())     //当获取结果“sum”时，所有被推迟的操作都被执行
    //>>>5050
}