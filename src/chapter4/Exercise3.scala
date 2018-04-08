package chapter4

import java.util.Scanner

import scala.collection.immutable.HashMap


object Exercise3 extends App {
  val in = new Scanner(new java.io.File("myfile.txt"))

  def countWords(in: Scanner): HashMap[String, Int] = {
    val map: HashMap[String, Int] = new HashMap[String, Int]

    def count(map: HashMap[String, Int]): HashMap[String, Int] = {
      if (in.hasNext) {
        val str = in.next

        if (!map.contains(str)) {
          count(map + (str -> 1))
        } else {
          count(map + (str -> (map(str) + 1)))
        }
      } else {
        map
      }
    }

    count(map)
  }

  private val map: HashMap[String, Int] = countWords(in)

  println(map)
}