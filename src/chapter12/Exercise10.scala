package chapter12

object Exercise10 extends App {
  // Implement an unless control abstraction that works just like if, but with an
  // inverted condition. Does the first parameter need to be a call-by-name
  // parameter? Do you need currying?

  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }

  var x = 10
  until (x == 0) {
    x -= 1
    println(x)
  }

  def unless(condition: Boolean)(block: => Unit): Unit = {
    if (!condition) block
  }

  println

  var z = 10
  unless(z != 10) {
    println(z)
  }
}
