
object Fraction {
  implicit def int2Fraction(n: Int) = Fraction(n, 1)

  implicit def fraction2Double(f: Fraction) = f.num * 1.0 / f.den

  def apply(n: Int, d: Int): Fraction = new Fraction(n, d)
}

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

3 * Fraction(4, 5) // calls fraction2Double

Fraction(4, 5) * 3 // calls int2Fraction, but if comment this method fraction2Double will be called