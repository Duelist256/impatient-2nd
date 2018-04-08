package chapter6

object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}

class Point(val x: Int, val y: Int)

object Exercise4 {
  def main(args: Array[String]): Unit = {
    val point = Point.apply(3, 4)
    println(s"x = ${point.x}, y = ${point.y}")
  }
}
