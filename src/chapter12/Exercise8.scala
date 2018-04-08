package chapter12

object Exercise8 extends App {

//  In Section 12.8, “Currying,” on page 164, you saw the corresponds method used
//  with two arrays of strings. Make a call to corresponds that checks whether the
//  elements in an array of strings have the lengths given in an array of integers.
  val a1 = Array("Abc", "Abcd", "Lolke", "Kekeke")
  val a2 = Array(3, 4, 5, 6)
  val a3 = Array(2, 4, 5, 6)

  println(a1.corresponds[Int](a2)(_.length == _))
  println(a1.corresponds[Int](a3)(_.length == _))
}
