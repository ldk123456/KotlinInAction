package Chapter09.FieldValidator

import kotlin.reflect.KClass

interface FieldValidator<in T> {    //接口定义成在T上逆变
    fun validate(input: T): Boolean //T只在in位置使用（这个方法只是消费T的值）
}

object DefaultStringValidator: FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator: FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator
}