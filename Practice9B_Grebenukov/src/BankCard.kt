package payments
import payments.Client
open class BankCard(val cardNumber: String, accountNumber: String, balance: Double): BankAccount(accountNumber, balance){
    override fun Tostring(): String{
        return "Банковская карта № $cardNumber, Связанный счет № $accountNumber, Баланс $balance"
    }
    override var isBlocked = false

    fun BlockCard():Boolean {
        isBlocked = true
        println("Карта заблокирована")
        return true
    }

    fun UnBlockCard(): Boolean {
        isBlocked = false
        println("Карта разблокирована")
        return false
    }
}
