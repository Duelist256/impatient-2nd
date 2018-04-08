package chapter8

// Compile the Person and SecretAgent classes in Section 8.6, “Overriding Fields,”
// on page 95 and analyze the class files with javap. How many name fields are
// there? How many name getter methods are there? What do they get? (Hint:
// Use the -c and -private options.)

object Exercise8 extends App {

  class Person(val name: String) {
    override def toString = s"${getClass.getName}[name=$name]"
  }

  class SecretAgent(codename: String) extends Person(codename) {
    override val name = "secret" // Don’t want to reveal name . . .
    override val toString = "secret" // . . . or class name
  }

  // After decompiling using javap 'name' fields:
  //  Person: 1 field name
  //  SecretAgent: 1 field name

  // 'name' getter methods:
  //  Person: 1 name()
  //  SecretAgent: 1 name()
  //  They return fields above

  val sanya = new Person("Sanya")
  val sanyaAgent = new SecretAgent("Sanya")
  println(sanya.name)
  println(sanyaAgent.name)
}
