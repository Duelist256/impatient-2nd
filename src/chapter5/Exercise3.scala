package chapter5

object Exercise3 extends App {

  class Time2(val hrs: Int, val min: Int) {
    if (hrs < 0 || hrs > 23) throw new IllegalArgumentException
    if (min < 0 || min > 59) throw new IllegalArgumentException

    def before(other: Time2): Boolean = {
      if (hrs < other.hrs) true
      else if (hrs == other.hrs && min < other.min) true
      else false
    }
  }

  val time = new Time2(23, 15)
  val time2 = new Time2(0, 0)
  //  val time3 = new Time(0, 60)
  //  val time4 = new Time(24, 0)
  println(time.before(time2))
  println(time2.before(time))
}
