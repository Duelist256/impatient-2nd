package chapter9

import scala.io.StdIn

object StdInExample extends App {
  val age: Int = scala.io.StdIn.readInt()
  println(s"You're ${age} years old1")
}
