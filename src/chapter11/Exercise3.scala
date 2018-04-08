package chapter11

object Exercise3 extends App {


  class Fraction(n: Int, d: Int) {

    import Math.abs

    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

    override def toString = s"$num/$den"
    private def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
    private def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

    def +(fraction: Fraction): Fraction =
      new Fraction(num * fraction.den + fraction.num * den, den * fraction.den)

    def -(fraction: Fraction): Fraction =
      new Fraction(num * fraction.den - fraction.num * den, den * fraction.den)

    def *(fraction: Fraction): Fraction =
      new Fraction(num * fraction.num, den * fraction.den)

    def /(fraction: Fraction): Fraction =
      new Fraction(num * fraction.den, den * fraction.num)
  }


  val f1 = new Fraction(3, 2)
  val f2 = new Fraction(1, 3)

  println(f1 + f2)
  println(f1 - f2)
  println(f1 * f2)
  println(f1 / f2)
}
