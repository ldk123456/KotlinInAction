package Chapter02

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun recognize(c: Char) =
        when (c){
            in '0'..'9' -> "It's a digit!"
            in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
            else -> "I don't know ..."
        }

fun main(args: Array<String>) {
    println("q是字母？${isLetter('q')}")
    //>>>true
    println("x不是数字？${isNotDigit('x')}")
    //>>>true
    println("8: ${recognize('8')}")
    //>>>It's a digit!
}