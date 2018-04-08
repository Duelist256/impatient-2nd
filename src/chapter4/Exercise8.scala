package chapter4

object Exercise8 extends App {
  def minmax(arr: Array[Int]): (Int, Int) = (arr.min, arr.max)
  val ints = Array(1, -2, 2, 5, 7, 123, -12)
  println(minmax(ints))
}
