package chapter4

import scala.collection.mutable

object Exercise6 extends App {
  val map = mutable.LinkedHashMap(
    "Sunday" -> java.util.Calendar.SUNDAY,
    "Monday" -> java.util.Calendar.MONDAY,
    "Tuesday" -> java.util.Calendar.TUESDAY,
    "Wednesday" -> java.util.Calendar.WEDNESDAY,
    "Thursday" -> java.util.Calendar.THURSDAY,
    "Friday" -> java.util.Calendar.FRIDAY,
    "Saturday" -> java.util.Calendar.SATURDAY)

  for (elem <- map) {
    println(elem)
  }
}
