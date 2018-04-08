package chapter14

object Exercise5 extends App {
  val list = List("kek", None, 3, "asda", 1, 5, 2.1, 11)

  def leafSum(list: List[Any]): Int = {
    def sum(list: List[Any], acc: Int): Int = {
      if (list.isEmpty) acc
      else list.head match {
        case x: Int => sum(list.tail, acc + x)
        case _ => sum(list.tail, acc)
      }
    }
    sum(list, 0)
  }

  println(leafSum(list))
}
