package chapter12


object Exercise6 extends App {
  // Modify the previous function to return the input at which the output is largest.
  // For example, largestAt(x => 10 * x - x * x, 1 to 10) should return 5. Don’t use
  // a loop or recursion

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.maxBy(fun)
  }

  println(largest(x => 10 * x - x * x, 1 to 10))
}
