package chapter5



object Exercise5 extends App {

  import scala.beans.BeanProperty
  class Student(@BeanProperty var id: Int, @BeanProperty var name: String)

  var student = new Student(1, "Kek")
  println(student.getId)
  println(student.getName)
}
