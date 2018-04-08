import scala.util.matching.Regex

val arr = Array(0, 1, 4, 5)
arr match {
  case Array(0) => "0"
  case Array(x, y) => s"$x $y"
//  case Array(0, _*) => "0 ..."
  case Array(0, 1, rest @ _*) => s"0, 1, sum of rest = ${rest.sum} ..."
  case _ => "something else"
}

val pattern: Regex = "([0-9]+) ([a-z]+)".r
"99 bottles" match {
  case pattern(num, item) => println(s"How many $item do we have? $num ")
  // Sets num to "99", item to "bottles"
}

val (q, r) = BigInt(10) /% 3

val Array(first, second, rest @ _*) = arr

val x = 5
val 2 = x

for ((k, "") <- System.getProperties())
  println(k)

//for ((k, v) <- System.getProperties if v == "") // it doesn't work
//  println(k)