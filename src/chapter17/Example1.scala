package chapter17

object Example1 extends App {
  import java.time._
  import scala.concurrent._
  import ExecutionContext.Implicits.global
  Future {
    Thread.sleep(10000)
    println(s"This is the future at ${LocalTime.now}")
  }
  println(s"This is the present at ${LocalTime.now}")
}
