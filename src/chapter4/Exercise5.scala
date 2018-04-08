package chapter4

import scala.collection.mutable

object Exercise5 extends App {
  val in = new java.util.Scanner(new java.io.File("myfile.txt"))
  val map = new mutable.TreeMap[String, Int]
  while (in.hasNext()) {
    val str = in.next()

    if (!map.contains(str)) {
      map.put(str, 1)
    } else {
      map.update(str, map(str) + 1)
    }
  }

  println(map)
}
