package chapter8

object Exercise1 extends App {
  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def currentBalance = balance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    override def deposit(amount: Double): Double = super.deposit(amount - 1)
    override def withdraw(amount: Double): Double = super.withdraw(amount + 1)
  }

  val account = new CheckingAccount(100)
  println(account.currentBalance)
  account.deposit(10)
  println(account.currentBalance)
  account.withdraw(10)
  println(account.currentBalance)
}
