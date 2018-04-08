package chapter12

object Exercise7 extends App {

  def adjustToPair(function: (Int, Int) => Int)(pair: (Int, Int)): Int = {
    function(pair._1, pair._2)
  }

  println(adjustToPair(_ * _)((6, 7))) // 42
}
