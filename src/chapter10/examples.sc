import javax.swing.JFrame

class A
class B
trait T1
trait T2
class C extends A with T1 with T2

trait Logger {
  def log(msg: String) // An abstract method
}

abstract class SavingsAccount extends Logger {
  var balance = 0
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else log("sufficient!11")
  }
}

trait ConsoleLogger extends Logger {
  def log(msg: String) { println(msg) }
}

val acct = new SavingsAccount with ConsoleLogger

trait TimestampLogger extends ConsoleLogger {
  override def log(msg: String) {
    super.log(s"${java.time.Instant.now()} $msg")
  }
}

trait ShortLogger extends ConsoleLogger {
  override def log(msg: String) {
    super.log(
      if (msg.length <= 15) msg else s"${msg.substring(0, 12)}...")
  }
}

val acct1 = new SavingsAccount with TimestampLogger with ShortLogger
val acct2 = new SavingsAccount with ShortLogger with TimestampLogger
acct1.withdraw(15)
acct2.withdraw(15)

// Example: defining which method should invoked first using super

val acct3 = new SavingsAccount with ShortLogger with TimestampLogger {
  override def log(msg: String): Unit = super[TimestampLogger].log(msg)
}
acct3.withdraw(15) // prints 2018-03-09T1...

val acct4 = new SavingsAccount with ShortLogger with TimestampLogger {
  override def log(msg: String): Unit = super[ShortLogger].log(msg)
}
acct4.withdraw(15) // prints Insufficient...

trait PetuchLogger extends ConsoleLogger {
  override def log(msg: String) {
    super.log(s"PETUCH $msg")
  }
}

val acct5 = new SavingsAccount with PetuchLogger with ShortLogger with TimestampLogger {
  override def log(msg: String): Unit = super[ShortLogger].log(msg)
}
acct5.withdraw(15) // prints PETUCH Insufficient...


//
trait LoggedException extends Exception with ConsoleLogger {
  def log() { log(getMessage()) }
}

class UnhappyException extends LoggedException { // This class extends a trait
  override def getMessage() = "arggh!"
}

//  illegal inheritance; superclass JFrame
//  is not a subclass of the superclass Exception
//  of the mixin trait LoggedException
// class UnhappyFrame extends JFrame with LoggedException
31 toHexString

List("a delicious sandwich", "protein", "high cholesterol").toString()