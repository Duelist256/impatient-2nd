package chapter4

import java.util.Scanner

import scala.collection.SortedMap

object Exercise4 extends App {
  val in = new Scanner(new java.io.File("myfile.txt"))

  def countWords(in: Scanner): SortedMap[String, Int] = {
    val map: SortedMap[String, Int] = SortedMap.newBuilder[String, Int].result()

    def count(map: SortedMap[String, Int]): SortedMap[String, Int] = {
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

  private val map: SortedMap[String, Int] = countWords(in)

  println(map)
}
