package chapter12

object Exercise5 extends App {

//  5. Write a function largest(fun: (Int) => Int, inputs: Seq[Int]) that yields the largest
//  value of a function within a given sequence of inputs. For example, largest(x
//  => 10 * x - x * x, 1 to 10) should return 25. Don’t use a loop or recursion.

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.map(fun).max
  }

  println(largest(x => 10 * x - x * x, 1 to 10))
}
