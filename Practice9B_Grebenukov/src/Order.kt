package payments

class Order(private val id: String, val totalPrice: Double) {
    fun getId(): String {
        return id
    }
}
