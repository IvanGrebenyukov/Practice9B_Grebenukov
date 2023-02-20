import payments.*

fun main() {
    // Создание клиента
    val client = Client("Иванов Иван Иванович", "ул. Ленина 1", "89777777777")

    //Создание банвского счета
    val bankAccount = BankAccount("40814567124556784356", 7000.0)

    //Создание банковской карты
    val bankCard = BankCard("1234567890123456", bankAccount.accountNumber, 5000.0)

    // Создаем заказа
    val order = Order(1, 10000.0)

    //Создаем администратора
    val administrator = Administrator("Андреев Андрей Андреевич", "ул. Первомайская 1", "89555555555")

    //Создаем платеж
    val tranfer = Payment(client, order, bankAccount, bankCard, administrator)

    // Проверка баланса
    bankAccount.GetBalance()

    //Информация о платеже
    println("Платеж на сумму ${order.amount} рублей с карты ${bankCard.cardNumber}")

    //Обрабатываем платеж
    tranfer.ProcessPayment()

    //Блокируем карту
    bankCard.BlockCard()

    //Пытаемся оплатить заказ с заблокированной картой
    tranfer.ProcessPayment()

    //Разблокируем карту
    bankCard.UnBlockCard()

    //Создаем еще один банковский счет
    val targetBankAccount = BankAccount("567914587124776784356", 0.0)

    //Переводим 1000 рублей на другой банковский счет
    bankAccount.Transfer(4000.0, targetBankAccount)

    //Проверяем балансы обоих счетов
    println("Баланс основной карты")
    bankAccount.GetBalance()
    println("Баланс другой карты")
    targetBankAccount.GetBalance()

    //Аннулируем счет
    bankAccount.Annul()

    //Проверяем баланс
    bankAccount.GetBalance()
}