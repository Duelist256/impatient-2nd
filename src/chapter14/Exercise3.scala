package chapter14

object Exercise3 extends App {
  // Using pattern matching, write a function swap that swaps the first two elements
  // of an array provided its length is at least two.

  def swap(array: Array[Int]): Array[Int] = {
    array match {
      case Array(a, b, rest @ _*) => Array(b, Seq(a) ++ rest: _*)
    }
  }

  val arr = Array(1, 2, 3, 4, 5)
  val newArr: Array[Int] = swap(arr)
  assert (newArr sameElements Array(2, 1, 3, 4, 5))
  newArr.foreach(x => print(x + " "))
}
