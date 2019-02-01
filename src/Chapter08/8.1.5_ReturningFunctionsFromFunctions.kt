package Chapter08.ReturningFunctionsFromFunctions

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return {order -> 6 + 2.1 * order.itemCount }    //返回lambda
    }
    return { order -> 1.2 * order.itemCount }
}

fun main() {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)  //将返回的函数保存在变量中
    println("Shipping costs ${calculator(Order(3))}")   //调用返回的函数
    //>>>Shipping costs 12.3
}