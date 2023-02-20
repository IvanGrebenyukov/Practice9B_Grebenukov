package payments

open class Client(private val name: String, val address: String, val phone: String) {
    fun Tostring(): String {
        return "Клиент $name, Адрес $address, Номер телефона $phone"
    }
}
