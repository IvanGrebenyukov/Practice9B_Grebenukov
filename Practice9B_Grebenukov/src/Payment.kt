package payments

class Payment(val client: Client, val order: Order, val bankAccount: BankAccount, val bankCard: BankCard, val administrator: Administrator )
{
    fun ProcessPayment()
    {
        if(bankCard.isBlocked)
        {
            println("Карта заблокирована. Платеж невозможен")
        }
        else if(bankAccount.isBlocked)
        {
            println("Счет заблокирован. Платеж невозможен")
        }
        else if(bankCard.balance < order.amount)
        {
            println("Недостаточно средств")
        }
        else
        {
            bankCard.balance -= order.amount
            bankAccount.balance -= order.amount
            println("Заказ успешно оплачен")
        }
    }
}