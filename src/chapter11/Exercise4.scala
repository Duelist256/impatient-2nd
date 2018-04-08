package chapter11

object Exercise4 extends App {

  class Money(dollars: Int, cents: Int) {
    private val total: Int = dollars * 100 + cents

    def +(money: Money): Money = {
      val sum = total + money.total
      new Money(sum / 100, sum % 100)
    }

    def -(money: Money): Money = {
      val sub = total + money.total
      new Money(sub / 100, sub % 100)
    }

    def ==(money: Money): Boolean =
      total == money.total

    def <(money: Money): Boolean =
      total < money.total
  }

  val m1 = new Money(1, 75)
  val m2 = new Money(0, 50)

  println(m1 + m2 == new Money(2, 25))
  println(m1 - m2 == new Money(1, 25))

  // we can't multiply and divide money to money
  // we should do it like, money to count, like divide 2 dollars 50 cents to 2 = 1.25 and 1.25
}
