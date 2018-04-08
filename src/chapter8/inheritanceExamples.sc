class A{
  val b  = 5
  override def toString: String = "keeek: " + b
}

class B extends A{
  def foo = super.toString
}

val b = new B
var str = b.foo

class Person(val name: String) {
  override def toString = s"${getClass.getName}[name=$name]"
}
class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret" // Don’t want to reveal name . . .
  override val toString = "secret" // . . . or class name
}

val agent = new SecretAgent("Pesig")
agent.name

abstract class AbstractValue {
  val a: Int
  def foo: Int
}

class HeirOfAbstractValue {
  val a = 5
  def foo: Int = a
}

val arr1 = Array(3, 5, 1)
val arr2 = Array("two", "three", "one")
arr1.zip(arr2)
arr2.zipWithIndex

// Equality
class Item(val description: String, val price: Double) {
  final override def hashCode(): Int = (description, price).##
}

// Value classes
class MilTime private(val time: Int) extends AnyVal
object MilTime {
  def apply(t: Int) =
    if (0 <= t && t < 2400 && t % 100 < 60) new MilTime(t)
    else throw new IllegalArgumentException
}

//val milTime: MilTime = 1