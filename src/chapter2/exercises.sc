

// 1
def signum(number: Int): Int =
  if (number < 0) -1 else if (number > 0) 1 else 0
signum(0)
signum(5)
signum(-2)

// 2
def empty() = {} // returns Unit

// 3
var x = ()
var y = 4
x = y = 1

// 4
for (i <- 10 to 0 by -1) {
  println(i)
}

// 5
def countdown(n: Int): Unit = {
  for (i <- n to 0 by -1) {
    println(i)
  }
}
countdown(5)

// 6
var product: Long = 1L
for (ch <- "Hello") {
  product = product * ch
}
product

// 7
var product2: Long = 1
"Hello".foreach(product2 *= _)
product2

// 8
def product(s: String): Long = {
  var result = 1L
  for (ch <- s) {
    result = result * ch
  }
  result
}

product("Hello")
product("Preved")

// 9
def recursiveProduct(s: String): Long = {
  if (s.length == 0) return 0
  if (s.length == 1) return 1 * s.charAt(0)
  s.charAt(0) * recursiveProduct(s.drop(1))
}

recursiveProduct("Hello")
recursiveProduct("Preved")

// 10
def fun(x: Int, n: Int): Int = {
  if (n == 0) 1
  else if (n < 0) 1 / fun(x, -n)
  else if (n % 2 == 1) x * fun(x, n - 1)
  else fun(x, n / 2) * fun(x, n / 2)
}
fun(5, 2)
fun(5, 3)
fun(152, 0)


// 11

import java.time.LocalDate
