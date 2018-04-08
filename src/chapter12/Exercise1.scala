package chapter12

object Exercise1 extends App {
  //  Write a function values(fun: (Int) => Int, low: Int, high: Int) that yields a collection
  //  of function inputs and outputs in a given range. For example, values(x =>
  //    x * x, -5, 5) should produce a collection of pairs (-5, 25), (-4, 16), (-3, 9), . . . ,
  //  (5, 25).

  def values(fun: (Int) => Int, low: Int, high: Int): Seq[(Int, Int)] = {
    for {
      elem <- low to high
    } yield (elem, fun(elem))
  }
  println(values(x => x * x, -5, 5))
}
