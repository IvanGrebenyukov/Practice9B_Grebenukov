import payments.*
class BankClient(accountNumber: String, cardNumber: String, var accountBalance: Double) : Client(accountNumber, cardNumber)
{
    var cardBlocked: Boolean = false

    fun GetBalance()
    {
        println("Ваш баланс $accountBalance")
    }

    override fun MakePayment(amount: Double)
    {
        if (cardBlocked) {
            println("Ошибка!Карта заблокирована")
        }

        else if (amount <= 0) {
            println("Ошибка!Неверная сумма платежа")
        }

        else if (amount > accountBalance) {
            println("Ошибка!Недостаточно средств")
        }
        // Реализация оплаты заказа
        else
        {
            accountBalance -= amount
            println("Операция проведена успешно. Ваш баланс $accountBalance")
        }

    }

    override fun TransferMoney(to: String, amount: Double)
    {
        if (cardBlocked) {
            println("Ошибка!Карта заблокирована")
        }

        else if (amount <= 0) {
            println("Ошибка!Неверная сумма платежа")
        }

        else if (amount > accountBalance) {
            println("Ошибка!Недостаточно средств")
        }
        else
        {
            accountBalance -= amount
            println("Операция проведена успешно. Ваш баланс $accountBalance")
        }
    }


    fun BlockCard()
    {
        cardBlocked = true
        println("Вы заблокировали карту")
    }

    fun UnBlockCard()
    {
        cardBlocked = false
        println("Вы разблокировали карту")
    }

    override fun CancelAccount()
    {
        // Реализация аннулирования счета
        accountBalance = 0.0
        cardBlocked = true
        println("Ваш счет аннулирован")
    }
}
