package chapter3

import java.util

import scala.collection.mutable.ArrayBuffer

object Exercise9 extends App {

  def efficient(a: ArrayBuffer[Int]): Unit = {
    val negativeIndices = new ArrayBuffer[Int]
    for (i <- 0 until a.length) {
      if (a(i) < 0) {
        negativeIndices += i
      }
    }
    val reversedAndWithoutFirst = negativeIndices.drop(1).reverse
    for (index <- reversedAndWithoutFirst) {
      a.remove(index)
    }
  }

  // Improve the solution of the preceding exercise by collecting the positions
  // that should be moved and their target positions. Make those moves and
  // truncate the buffer. Don’t copy any elements before the first unwanted
  // element.
  // ...
  // sounds breadovo!
  def moreEfficient(a: ArrayBuffer[Int]): Unit = {
    val positiveIndices = new ArrayBuffer[Int]
    var negativeIndices = new ArrayBuffer[Int]
    var shouldBeMoved = new ArrayBuffer[Int]
    for (i <- 0 until a.length) {
      if (a(i) < 0) {
        negativeIndices += i
        shouldBeMoved += i + 1
      }
    }

    negativeIndices = negativeIndices.drop(1)
    shouldBeMoved = shouldBeMoved.drop(1)

    println(negativeIndices)
    println(shouldBeMoved)

    for (index <- negativeIndices; moved <- 0 until shouldBeMoved.length) {
      val i = shouldBeMoved(moved)
      if (i < a.length) a(index) = a(i)
    }

    negativeIndices = negativeIndices.reverse

    negativeIndices.foreach(e => a.remove(e))
  }

  val ints1 = ArrayBuffer(1, 2, -42, 234, -3, -6, 23, -5)
  moreEfficient(ints1)
  println(ints1)
}
