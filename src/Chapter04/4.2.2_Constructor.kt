package Chapter04.Constructor

import javax.naming.Context
import javax.print.attribute.AttributeSet

open class View {
    //从构造方法
    constructor(ctx: Context) {
        // some code
    }
    constructor(ctx: Context, attr: AttributeSet) {
        // some code
    }
}

class MyButton : View {
    //调用父类构造方法
    constructor(ctx: Context): super(ctx) {
        // some code
    }
    //委托给这个类的另一个构造方法
    /*constructor(ctx: Context): this(ctx, MY_STYLE) {
        // some code
    }*/
    constructor(ctx: Context, attr: AttributeSet): super(ctx, attr) {
        // some code
    }
}