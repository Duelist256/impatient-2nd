package chapter9

import scala.io.Source

object ReadLineExample extends App {
  val source = Source.fromFile("myfile.txt", "UTF-8")
//  println(source.mkString)

  for (c <- source) print(s"$c")

  val iterator: Iterator[String] = source.getLines()
  for (elem <- iterator) {
    print(elem + " ")
  }

  source.close
}
