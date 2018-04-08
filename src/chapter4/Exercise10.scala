package chapter4

object Exercise10 extends App {
  println("Hello".zip("World")) // vector of tuples of chars: (H, W), (e, o) ...


  // example
  val diff = "Hello world!!".zip("hello world!1").filter(t => t._1!=t._2) // difference between strings
  println(diff)
}
