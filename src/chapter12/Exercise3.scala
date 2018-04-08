package chapter12

object Exercise3 extends App {
  //  Implement the factorial function using to and reduceLeft,
  //  without a loop or recursion.

  def factByRedue(n: Int): Int = {
    (1 to n).reduceLeft(_ * _) // or we can just use product
  }

  println(factByRedue(5))
}
