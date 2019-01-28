package Chapter06.NullabilityOfTypeParameters

fun <T> printHashCode(t: T) {
    println(t?.hashCode())  //因为t可能为null，所有必须使用安全调用
}

fun <T: Any> printHashCode1(t: T) {     //现在T就不是可空的
    println(t.hashCode())
}

fun main() {
    printHashCode(null)     //T被推导成Any？
    //>>>null
    //printHashCode1(null)  这段代码无法编译：不能传递null，因为期望的是非空值
    printHashCode1(42)
    //>>>42
}