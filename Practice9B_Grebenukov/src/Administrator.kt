package payments

class Administrator(val name: String ,val address:String, val phone: String)
{
    fun Tostring(): String
    {
        return "Администратор $name, Адрес $address, Номер телефона $phone"
    }
    fun BlockCard(card: BankCard){
        card.isBlocked = true
        println("Карта заблокирована администратором")
    }
    fun UnBlockCard(card: BankCard){
        card.isBlocked = false
        println("Карта разблокирована администратором")
    }
}