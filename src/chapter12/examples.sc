import scala.math._
val num = 3.14
val funWithUnderscore = ceil _
val fun: Double => Double = ceil

Array(3.14, 1.42, 2.0).map(fun)

val triple = (x: Double) => 3 * x
Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)

// method is declared as def it has type as (x: Double)Double
// function has types like Double => Double


def mulBy(factor : Double) = (x : Double) => factor * x
val quintuple = mulBy(5)
quintuple(20) // 100

//val fun2 = 3 * _ // Error: Can’t infer types
val fun3 = 3 * (_: Double) // OK
val fun4: (Double) => Double = 3 * _ // OK because we specified the type for fun
fun3(5.5)
fun4(7.5)

1 to 9 map("*" * _) foreach println

//The reduceLeft method takes a binary function—that is,
// a function with two parameters — and applies it to all
// elements of a sequence, going from left to right. For example:
(1 to 9).reduceLeft(_ * _)


val a = Array("Hello", "World")
val b = Array("hello", "world")
a.corresponds(b)(_.equalsIgnoreCase(_))

// 12.9 Control Abstractions
def until(condition: => Boolean)(block: => Unit) {
  if (!condition) {
    block
    until(condition)(block)
  }
}

var x = 10
until (x == 0) {
  x -= 1
  println(x)
}

def indexOf(str: String, ch: Char): Int = {
  var i = 0
  until (i == str.length) {
    if (str(i) == ch) return i
    i += 1
  }
  -1
}
indexOf("Hello", 'o')

val pairs = (1 to 10) zip (11 to 20)