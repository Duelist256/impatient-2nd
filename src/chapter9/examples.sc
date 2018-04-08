import java.math.BigInteger

import scala.io.Source

//Source.fromFile("myfile.txt", "UTF-8")

implicit def Int2BigIntegerConvert(value: Int): BigInteger =
  new BigInteger(value.toString)

def add(a: BigInteger, b: BigInteger) = a.add(b)

add(Int2BigIntegerConvert(3), Int2BigIntegerConvert(6)) == Int2BigIntegerConvert(9)

add(3, 6) == 9
add(3, 6) == Int2BigIntegerConvert(9)

add(3, 6) == (9: BigInteger)
add(3, 6).intValue == 9


def fact(n: BigInt): BigInt = {
  if (n == 0) 1
  else n * fact(n - 1)
}
val n = 1
fact(n)

def factorial(n: BigInt): BigInt = {
  //  if (n == 0) 1
  //  else n * fact(n - 1)

  def fact(accum: BigInt, n: BigInt): BigInt = {
    if (n == 0) accum
    else fact(accum * n, n - 1)
  }

  fact(1, n)
}

factorial(5)