package payments

class Order(val orderid: Int, val amount: Double) {
    fun Tostring(): String {
        return "Заказ № $orderid на сумму $amount руб."
    }
}