package chapter3

import scala.collection.mutable.ArrayBuffer

object Exercise8 extends App {

  def inefficient(a: ArrayBuffer[Int]): Unit = {
    var first = true
    var n = a.length
    var i = 0
    while (i < n) {
      if (a(i) >= 0) i += 1
      else {
        if (first) {
          first = false; i += 1
        }
        else {
          a.remove(i); n -= 1
        }
      }
    }
  }

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

  val ints1 = ArrayBuffer(1, 2, -42, 234, -3, -6, 23)
  val ints2 = ArrayBuffer(1, 2, -42, 234, -3, -6, 23)

  var start: Long = System.nanoTime()
  inefficient(ints1)
  var end: Long = System.nanoTime()
  println(s"Time elapsed for inefficient: ${end - start}")
  println(ints1)


  start = System.nanoTime()
  efficient(ints2)
  end = System.nanoTime()
  println(s"Time elapsed for efficient (indeed inefficient =]): ${end - start}")
  println(ints2)
}
