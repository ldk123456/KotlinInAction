package Chapter03

open class View{
    open fun click() = println("View clicked")
}

/**
 * Button继承View
 */
class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    //>>>Button clicked
    view.showOff()          //扩展函数被静态地解析
    //>>>I'm a view!
}