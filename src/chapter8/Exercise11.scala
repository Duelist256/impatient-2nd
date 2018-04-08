package chapter8

object Exercise11 extends App {
  // 11. Define a value class Point that packs integer x and y coordinates into a Long
  // (which you should make private).
  class Point(_x: Int, _y: Int) {
    private val longX = _x.toLong
    private val longY = _y.toLong
    def x = longX
    def y = longY
  }

  val point = new Point(1, 3)
  println(point.x)
  println(point.y)
}
