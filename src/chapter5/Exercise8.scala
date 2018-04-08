package chapter5

object Exercise8 extends App {

  class Car(val manufacturer: String, val name: String) {
    private var _year: Int = -1
    var licensePlate: String = ""

    def this(manufacturer: String, name: String, year: Int) {
      this(manufacturer, name)
      this._year = year
    }

    def this(manufacturer: String, name: String, licensePlate: String) {
      this(manufacturer, name)
      this.licensePlate = licensePlate
    }

    def this(manufacturer: String, name: String, year: Int, licensePlate: String) {
      this(manufacturer, name)
      this._year = year
      this.licensePlate = licensePlate
    }

    def year: Int = _year
  }

  val tesla = new Car("Tesla", "Model X")
  val lexus = new Car("Lexus", "LS 400", 2017)
  val porshe = new Car("Porshe", "911", 2015, "2342das")

  val cars = List(tesla, lexus, porshe)
  for (elem <- cars) {
    println(s"${elem.manufacturer} : ${elem.name} : ${elem.year} : ${elem.licensePlate}")
  }
}
