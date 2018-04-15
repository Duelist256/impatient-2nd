// Type classes

trait NumberLike[T] {
  def plus(x: T, y: T): T
  def divideBy(x: T, n: Int): T
}

object NumberLike {
  implicit object NumberLikeDouble extends NumberLike[Double] {
    def plus(x: Double, y: Double) = x + y
    def divideBy(x: Double, n: Int) = x / n
  }
  implicit object NumberLikeBigDecimal extends NumberLike[BigDecimal] {
    def plus(x: BigDecimal, y: BigDecimal) = x + y
    def divideBy(x: BigDecimal, n: Int) = x / n
  }
}

def average1[T](x: T, y: T)(implicit ev: NumberLike[T]) =
  ev.divideBy(ev.plus(x, y), 2)

def average2[T : NumberLike](x: T, y: T) = {
  val ev = implicitly[NumberLike[T]]
  ev.divideBy(ev.plus(x, y), 2)
}

class Point(val x: Double, val y: Double)
object Point {
  def apply(x: Double, y: Double) = new Point(x, y)
  implicit object NumberLikePoint extends NumberLike[Point] {
    def plus(p: Point, q: Point) = Point(p.x + q.x, p.y + q.y)
    def divideBy(p: Point, n: Int) = Point(p.x * 1.0 / n, p.y * 1.0 / n)
  }
}

average1(BigDecimal(10), BigDecimal(30))
val avPoint = average1(Point(1, 1), Point(1, 3))
avPoint.x
avPoint.y
