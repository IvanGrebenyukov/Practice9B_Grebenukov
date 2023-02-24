import payments.*
fun main()
{
        val client = BankClient("123456789", "987654321", 10000.0)
        val admin = Administrator()

        //Проверка баланса
        client.GetBalance()

        //Оплата заказа
        client.MakePayment(100.0)

        //Перевод средств
        client.TransferMoney("987654321", 500.0)

        //Блокировка клиентом карты
        client.BlockCard()

        //Попытка перевести деньги с заблокированной картой
        client.TransferMoney("987654321", 1000.0)


        //Блокировка карты администратором
        admin.BlockCard(client)

        //Разблокировка карты
        client.UnBlockCard()

        //Попытка перевести деньги
        client.TransferMoney("987654321", -10000.0)

        //Аннулирование счета
        client.CancelAccount()

        //Проверка баланса
        client.GetBalance()
}

