package chapter12

import chapter12.Exercise2.array

object Exercise2 extends App {
  //  2. How do you get the largest element of an array with reduceLeft?
  val array = Array(1, 2, 3, 75, -140, 4, 5)
  def maxByReduceLeft(array: Array[Int]): Int = {
    array.reduceLeft((e1, e2) => if (e1 > e2) e1 else e2)
  }
  println(maxByReduceLeft(array))
}
