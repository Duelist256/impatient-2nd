package chapter8

object Exercise2 {

  // Extend the BankAccount class of the preceding exercise into a class SavingsAccount
  // that earns interest every month (when a method earnMonthlyInterest is called)
  // and has three free deposits or withdrawals every month. Reset the transaction
  // count in the earnMonthlyInterest method.

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def currentBalance = balance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    private var balance = initialBalance

    private var transactionCount = 3

    def earnMonthlyInterest(rate: Double): Double  = {
      balance = balance + balance * rate
      balance
    }

    override def deposit(amount: Double): Double = {
      changeTransactionCount
      super.deposit(amount)
    }

    override def withdraw(amount: Double): Double = {
      changeTransactionCount
      super.withdraw(amount)
    }

    private def changeTransactionCount = {
      transactionCount -= 1
      if (transactionCount == 0) transactionCount = 3
    }
  }
}
