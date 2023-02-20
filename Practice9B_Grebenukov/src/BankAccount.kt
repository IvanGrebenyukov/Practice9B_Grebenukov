package payments
import payments.BankCard
open class BankAccount(private val accountNumber: String, private var balance: Double)
{
    fun getAccountNumber(): String {
        return accountNumber
    }

    fun GetBalance(): Double {
        return balance
    }
    fun Annul() {
        balance = 0.0
    }

    fun Transfer(amount: Double, recipient: BankAccount){
        if (balance < amount) {
            println("Перевод невозможен, недостаточно средств на счете")

        }
        else if(CheckForBlocking())
        balance -= amount
        recipient.balance += amount
        println("Перевод успешно выполнен")

    }
}
