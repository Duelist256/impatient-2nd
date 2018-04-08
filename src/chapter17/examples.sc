import java.time.LocalTime

import com.sun.net.httpserver.Authenticator.{Failure, Success}

import scala.concurrent._
import scala.util.{Failure, Success, Try}
import ExecutionContext.Implicits.global

val str = ""
val result = Try(str.toInt)
result.failed.get.getMessage
result.toOption

val f2 = Future {
  if (LocalTime.now.getHour > 12)
    throw new Exception("too late")
  42
}

Thread.sleep(10002)

f2.onComplete {
  case util.Success(v) => println(s"The value is $v")
  case util.Failure(ex) => println(ex.getMessage)
}