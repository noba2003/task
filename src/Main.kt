//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val creditCard=CreditCard()
    val payPal =PayPal()
process(creditCard)
process(payPal)
}

fun process(payment: payment){
    when(payment){
        is PayPal -> println(payment.processPayment())
        is CreditCard -> println(payment.processPayment())
    }
}