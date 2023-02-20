package payments
import payments.Client
open class BankAccount( val accountNumber: String, var balance: Double)
{
    open var isBlocked = false
    open fun Tostring(): String {
        return "Банковский счет № $accountNumber, Баланс $balance"
    }
    fun GetBalance() {
        //Метод для проверки баланса
        println("Баланс на карте $balance")
    }
    fun Annul() {
        //Метод для анулирования счета
        println("Счет $accountNumber аннулирован")
        balance = 0.0
    }
    fun BlockAccount(){
        isBlocked = true
        println("Счет заблокирован")
    }
    fun UnBlockAccount(){
        isBlocked = false
        println("Счет заблокирован")
    }
    fun Transfer(amount: Double, targetAccount: BankAccount){
        //Метод для перевода денег на другой счет
        if (balance < amount) {
            println("Перевод невозможен, недостаточно средств на счете")
        }
        else
        {
            balance -= amount
            targetAccount.balance += amount
            println("Перевод на сумму $amount выполнен успешно")
        }
    }
}
