package chapter9

object RegExpExamples extends App {

  val numPattern = "[0-9]+".r

  for (matchString <- numPattern.findAllIn("99 bottles, 98 bottles"))
    println(matchString)

  println

  val array: Array[String] = numPattern.findAllIn("129 bottles, 28 bottles").toArray
  for (elem <- array)
    println(elem)

  private val str: String = numPattern.replaceSomeIn("119 keks, 2342 lols, 231 cookies",
    m => if (m.matched.toInt % 2 == 0) Some("XX") else None)
  println(str);

  println

  val numitemPattern = "([0-9]+) ([a-z]+)".r
  for (m <- numitemPattern.findAllMatchIn("99 kes, 98 bottles")) {
    println(m.group(1)) // Prints 99 and 98
    println(m.group(2))
  }
}
