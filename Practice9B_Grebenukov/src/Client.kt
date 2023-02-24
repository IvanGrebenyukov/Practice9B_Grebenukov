package payments

open class Client(val accountNumber: String, val cardNumber: String)
{
    open fun MakePayment(amount: Double) {}
    open fun TransferMoney(to: String, amount: Double) {}
    open fun CancelAccount() {}
}
