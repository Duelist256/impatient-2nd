package chapter4

object Exercise9 extends App {
  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int)
  = (values.count(_ < v), values.count(_ == v), values.count(_ > v)) // not effective?

  val ints = Array(1, -2, 2, 5, 7, 123, -12)
  println(lteqgt(ints, 5))
}
