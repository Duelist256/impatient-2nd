package chapter5

object Exercise4 extends App {

  class Time(val hrs: Int, _min: Int) {
    if (hrs < 0 || hrs > 23) throw new IllegalArgumentException
    if (min < 0 || min > 59) throw new IllegalArgumentException

    def before(other: Time): Boolean = {
      if (hrs < other.hrs) true
      else if (hrs == other.hrs && min < other.min) true
      else false
    }

    def min(): Int = hrs * 60 + _min
  }

  val time = new Time(23, 15)
  val time2 = new Time(1, 15)
  println(time.min())
  println(time2.min())
}
