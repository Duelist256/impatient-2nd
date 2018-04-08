// object private example
class Counter {
  private[this] var value = 0 // just have acees for current object
  // getters and setters will no generate

  def doSmth(obj: Counter): Unit = {
    //    obj.value // not allowed
  }


}

class Person(val name1: String, private val name2: String)


class Network(val name: String) {
  outer =>

  class Member(val name: String) {
    def description = s"$name inside ${outer.name}"
  }
}