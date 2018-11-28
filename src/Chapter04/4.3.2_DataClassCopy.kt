package Chapter04.DataClassCopy

data class Client(val name: String, val postalCode: Int) {
    /*fun copy(name: String = this.name,
             postalCode: Int = this.postalCode) {
        Client(name, postalCode)    //手动实现copy方法
    }*/
}

fun main(args: Array<String>) {
    val bob = Client("Bob", 973293)
    println(bob.copy(postalCode = 382555))
    //Client(name=Bob, postalCode=382555)
}