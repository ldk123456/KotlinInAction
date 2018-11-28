package Chapter04.Main

interface Clickable {
    fun click()     //普通的方法声明
    fun showOff() = println("I was clickable!")     //带默认实现的方法
}

interface Focusable {
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked.")
    //如果同样的继承成员有不止一个实现，必须提供一个显示实现
    override fun showOff() {
        //使用尖括号加上父类型名字的“super”表明了你想要调用哪一个父类的方法
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
    /** 输出
     * I was clickable!
     * I'm focusable!
     * I got focus.
     * I was clicked.
     */
}