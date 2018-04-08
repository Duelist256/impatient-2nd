package chapter9

import java.io.{FileOutputStream, ObjectOutputStream}

object SerializableExample extends App {
  @SerialVersionUID(42L) class Person(val age: Int) extends Serializable

  val fred = new Person(42  )

  val out = new ObjectOutputStream(new FileOutputStream("test.obj"))
  out.writeObject(fred)
  out.close()
}
