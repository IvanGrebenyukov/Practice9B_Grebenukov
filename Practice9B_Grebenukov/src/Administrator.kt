import payments.*
class Administrator : Client("admin", "") {
    fun BlockCard(client: BankClient) {
        // Реализация блокировки банковской карты за превышение платежа
        if (client.cardBlocked) {
            println("Банковская карта уже заблокирована")
        }

        else if (client.accountBalance < 0) {
            client.cardBlocked = true
            println("Карта заблокирована администратором")
        }
    }
}
