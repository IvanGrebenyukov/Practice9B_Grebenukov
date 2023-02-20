package payments

fun main() {
    // Создание счета и карты
    val account = BankAccount("1234567890", 5000.0)
    val card = BankCard("1111222233334444", account)

    // Оплата заказа
    val order = Order("123", 1000.0)
    card.Pay(order)

    // Проверка баланса
    println(account.GetBalance())

    // Перевод средств на другой счет
    val recipientAccount = BankAccount("0987654321", 0.0)
    val amount = 1000.0
    account.Transfer(amount, recipientAccount)

    // Проверка баланса
    println(account.GetBalance())

    // Блокировка карты клиентом
    card.Block()

    //Разблокировка карты
    card.UnBlock()

    // Блокировка карты администратором
    val payment = 10000.0
    card.checkPayment(payment)

    // Аннулирование счета
    account.Annul()
    println("Счет аннулирован")

    // Проверка баланса
    println(account.GetBalance())

}