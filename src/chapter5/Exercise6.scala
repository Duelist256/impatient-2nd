package chapter5

object Exercise6 extends App {
  class Person(var age: Int) {
    if (age < 0) age = 0
  }

  val person = new Person(-12)
  println(person.age)
}
