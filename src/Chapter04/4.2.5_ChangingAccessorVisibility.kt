package Chapter04.ChangingAccessorVisibility

class LengthCounter {
    var counter: Int = 0
        private set         //不能在类外部修改这个属性

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    var lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    //lengthCounter.counter = 1       错误
    println(lengthCounter.counter)
    //>>>3
}