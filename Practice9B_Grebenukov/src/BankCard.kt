package payments
import payments.BankAccount
open class BankCard(private val cardNumber: String, private val account: BankAccount) {

    private var isBlocked = false

    fun Block() {
        isBlocked = true
        println("Карта заблокирована")
    }

    fun UnBlock() {
        isBlocked = false
        println("Карта разблокирована")
    }
    fun CheckForBlocking():Boolean
    {
        return isBlocked
    }
    fun Pay(order: Order){
        if (CheckForBlocking()) {
            println("Оплата невозможна, карта заблокирована")
        }
        if (account.GetBalance() < order.totalPrice) {
            println("Оплата невозможна, недостаточно средств на счете")
        }
        else{
            account.Transfer(order.totalPrice, BankAccount("merchant_account", order.totalPrice))
            println("Заказ успешно оплачен")
        }
    }

    fun checkPayment(payment: Double){
        if (account.GetBalance() < payment) {
            isBlocked = true
            println("Карта заблокирована за превышение платежа")
        }
        else{
            println("Баланса хватает")
        }

    }
}
