package Chapter05.TheWithFunction

fun alphabet1(): String {
    val result = StringBuilder()
    return with(result) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun alphabet2() = with(StringBuilder()) {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun main(args: Array<String>) {
    println(alphabet1())
    println(alphabet2())
    //>>>ABCDEFGHIJKLMNOPQRSTUVWXYZ
    //>>>Now I know the alphabet!
}