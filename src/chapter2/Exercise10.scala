package chapter2

object Exercise10 extends App {
  def pow(x: Int, n: Int): Int = {
    if (n == 0) 1
    if (n < 0) 1 / pow(x, -n)
    if (n % 2 == 1) x * pow(x, n - 1)
    else pow(x, n / 2) * pow(x, n / 2)
  }
  pow(5, 0)
}
