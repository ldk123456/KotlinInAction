package Chapter11.InvokeConvention

class Greeter(val greeting: String) {
    operator fun invoke(name: String) { //在Greeter上定义invoke方法
        println("$greeting, $name!")
    }
}

fun main() {
    val bavarianGreeter = Greeter("Servus")
    bavarianGreeter("Dmitry")   //像函数一样调用Greeter实例
    //>>>Servus, Dmitry!
}