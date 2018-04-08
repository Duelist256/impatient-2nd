package chapter5

object Exercise7 extends App {

  class Person(fullName: String) {
    val firstName = fullName.split(" ")(0)
    val lastName = fullName.split(" ")(1)
  }

  val person = new Person("John Smith")
  println(person.firstName)
  println(person.lastName)

  // it can be plain if we don't need full name aftwewards
  // it can be val if we need to get full name
  // it can be var if we need to change full name, but we can't change firstName and lastName fields, but
  // we can do it changing them to vars and redefine setter for full name for changing these fields
}
