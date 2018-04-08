package chapter5

object Exercise10 extends App {

  class Employee(val name: String, var salary: Double) {
    def this() {
      this("John Q. Public", 0.0)
    }
  }

  class Employee2 {
    val name: String = "John Q. Public"
    var salary: Double = 0.0
  }

  // First is more preferred because we can set our values to val which are read only
  // With second variand we have to either to change val to var or make private var with additional getters
}
