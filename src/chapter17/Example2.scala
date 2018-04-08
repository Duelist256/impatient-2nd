package chapter17

object Example2 extends App {
  import scala.concurrent._
  import ExecutionContext.Implicits.global

  Future { for (i <- 1 to 100) { print("A"); Thread.sleep(10) } }
  Future { for (i <- 1 to 100) { print("B"); Thread.sleep(10) } }
}
