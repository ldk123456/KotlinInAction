package Chapter02

fun fizzBuzz(i: Int) =
        when {
            //% 取模运算符
            i % 15 == 0 -> "FizzBuzz "              //如果i能被15整除，返回FizzBuzz
            i % 3 == 0 -> "Fizz "                   //如果i能被3整除，返回Fizz
            i % 5 == 0 -> "Buzz "                   //如果i能被5整除，返回Buzz
            else -> "$i "                           //否则返回数字自己
        }

fun main(args: Array<String>) {
    println("在整数区间1..100迭代：")
    for (i in 1..100){
        print(fizzBuzz(i))
        //>>>1 2 Fizz 4 Buzz Fizz 7 ...
    }
    println("\n从100倒着计数并且只计偶数：")
    for (i in 100 downTo 1 step 2){
        print(fizzBuzz(i))
        //>>>Buzz 98 Fizz 94 92 FizzBuzz 88 ...
    }
}