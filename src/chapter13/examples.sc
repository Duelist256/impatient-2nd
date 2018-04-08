import scala.collection.mutable.ArrayBuffer

def digits(n: Int): Set[Int] =
  if (n < 0) digits(-n)
  else if (n < 10) Set(n)
  else digits(n / 10) + (n % 10)

digits(132)

// A Vector is the immutable equivalent of an ArrayBuffer

val list = 9 :: 2 :: 3 :: 5 :: Nil
list.init
val list2 = "a" :: "s" :: "a" :: "p" :: Nil
list2.slice(1, 4)
list2.view(1, 4)

val words = List("Kek", "Kek", "Kick", "Aba", "Abc")
val map = words.groupBy(_.substring(0, 1).toUpperCase)

words.collect {
  case "Kek" => "Petuch"
  case "Abc" => "CBA"
  case _ => "Lol"
}

ArrayBuffer(1, 2).transform(_ * 2)

"Scala".zipWithIndex.max._1
1

// Stream is immutable alternative to Iterator
// Stream is immutable list in which the tail is computed lazily

def numsFrom(n: BigInt): Stream[BigInt] = n #:: numsFrom(n + 1)
val tenOrMore = numsFrom(10)
val squares = numsFrom(1).map(x => x * x)
squares
squares.take(5).force
squares

// Views unlike Streams do not cache values
val palindromicSquares = (1 to 1000000).view
  .map(x => x * x)
  .filter(x => x.toString == x.toString.reverse)

palindromicSquares.take(10).mkString(",")
palindromicSquares

(1 to 10).par.range