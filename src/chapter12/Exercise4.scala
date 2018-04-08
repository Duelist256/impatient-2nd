package chapter12

object Exercise4 extends App {
//  println(Exercise3.factByRedue(-1)) // not good, won't compile

  def factByFoldLeft(n: Int): Int = {
    (1 to n).foldLeft(1)(_ * _)
  }

  println(factByFoldLeft(-1))
  println(factByFoldLeft(5))
  println(factByFoldLeft(4))
}
