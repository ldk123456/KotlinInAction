package Chapter04.PublicModifiers

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

/* "public"成员暴露了其“internal”接收者类型TalkativeButton
fun TalkativeButton.giveSpeech() {
    //不能访问：它在“TalkativeButton”中是“private”的
    yell()
    //不能访问：它在“TalkativeButton”中是“protected”的
    whisper()
}*/
