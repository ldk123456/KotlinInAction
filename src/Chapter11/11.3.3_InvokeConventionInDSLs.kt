package Chapter11.InvokeConventionInDSLs

import java.util.regex.Matcher

class DependencyHandler {
    fun compile(coordinate: String) {   //定义一个普通的命令API
        println("Added dependency on $coordinate")
    }

    operator fun invoke(body: DependencyHandler.() -> Unit) {//定义invoke来支持DSL API
        body()      //this变成了body函数的接收者：this.body()
    }
}

fun main() {
    val dependencies = DependencyHandler()
    dependencies.compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
    dependencies {
        compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
    }
    //>>>Added dependency on org.jetbrains.kotlin:kotlin-stdlib:1.0.0


}