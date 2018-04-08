// 1
class Counter {
  private var value = 0 // You must initialize the field
  def increment() {
    if (value == Int.MaxValue)
      value = 0
    else
      value += 1
  } // Methods are public by default
  def current() = value
}
//val counter = new Counter
//for (i <- 1 to Int.MaxValue) {
//  counter.increment()
//}
//counter.current()
//counter.increment()
//counter.current()

// 2
class BankAccount {
  private var balance = 0

  def deposit(count: Int): Unit = {
    balance += count
  }

  def withDraw(count: Int) = {
    balance -= count
  }

  def getBalance(): Int = {
    balance
  }
}

val account = new BankAccount
account.deposit(1000)
account.deposit(1500)
account.withDraw(750)
account.getBalance()