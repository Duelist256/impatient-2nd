package chapter14

object Exercise2 extends App {
  // Using pattern matching, write a function swap that receives a pair of integers
  // and returns the pair with the components swapped.

  def swap(pair:(Int, Int)): (Int, Int) = {
    pair match {
      case (a, b) => (b, a)
    }
  }

  assert (swap((1, 2)) == (2, 1))
  assert (swap((3, 2)) == (2, 3))
  assert (swap((77, 21)) == (21, 77))
  print("Success!")
}
