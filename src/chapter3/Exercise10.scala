package chapter3

import java.util.TimeZone

object Exercise10 extends App {
  private val timezones: Array[String] = TimeZone.getAvailableIDs

  private val americanTimeZones: Array[String] =
    timezones.filter(_.startsWith("America/")).map(_.stripPrefix("America/")).sorted
  for (elem <- americanTimeZones) {
    println(elem)
  }
}
