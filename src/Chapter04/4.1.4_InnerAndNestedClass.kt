package Chapter04.InnerAndNestedClass

import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button: View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {}

    //这个类与Java中的静态嵌套类类似
    class ButtonState: State {}
}

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}