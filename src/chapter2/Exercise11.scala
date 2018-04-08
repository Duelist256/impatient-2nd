package chapter2

import java.time.LocalDate
import java.time.format.DateTimeFormatter

object Exercise11 {
  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      val str = sc.parts.mkString
      val strings = str.split("-")

      val year = strings(0).toInt
      val month = strings(1).toInt
      val day = strings(2).toInt

      LocalDate.of(year, month, day)
    }

}
  def main(args: Array[String]): Unit = {
    val date = date"2011-11-11"
    println(date.getDayOfWeek + " " + date.getMonth + " " + date.getYear)
  }
}

