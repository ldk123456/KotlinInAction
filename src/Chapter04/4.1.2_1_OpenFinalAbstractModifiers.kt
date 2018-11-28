package Chapter04.OpenFinalAbstractModifiers

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

//这个类是open的：其他类可以继承它
open class RichButton : Clickable {
    //这个函数是final的：不能在子类中重写它
    fun disable() {}
    //这个函数是open的：可以在子类中重写它
    open fun animate() {}
    //这个函数重写了一个open函数并且它本身同样是open的
    override fun click() {}
    /*在这里“final”并没有被删减是因为没有“final”的“override”意味着是open的
    final override fun click() {}*/
}