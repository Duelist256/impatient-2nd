package chapter12

object Exercise9 extends App {
  def corresponds[A, B](first: Array[A], second: Array[B], fun: (A, B) => Boolean): Boolean = {
    if (first.length != second.length) false
    else {
      for (i <- first.indices) {
        if (!fun(first(i), second(i))) return false
      }
      true
    }
  }

  val a1 = Array("Abc", "Abcd", "Lolke", "Kekeke")
  val a2 = Array(3, 4, 5, 6)
  val a3 = Array(2, 4, 5, 6)

  println(corresponds[String, Int](a1, a2, _.length == _))
  println(corresponds[String, Int](a1, a3, _.length == _))

  // To set anonymous function I have to explicitly specify types of elements of Array
  // And i have to write two parameters for 'this' and 'that' arrays, but it can be fixed
  // using implicit classes which described in another chapter big push() krskya eight
}
