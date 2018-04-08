class Car(val make: String, val model: String, val year: Short, val topSpeed: Short)

object ChopShop {
  def unapply(x: Car) = Some(x.make, x.model, x.year, x.topSpeed)
}

val ChopShop(a, b, c, d) = new Car("Chevy", "Camaro", 1978, 120)


class Employee(
                val firstName: String,
                val middleName: Option[String],
                val lastName: String
              )

object Employee {
  //factory methods, extractors, apply
  //Extractor: Create tokens that represent your object
  def unapply(x: Employee) =
    Some(x.lastName, x.middleName, x.firstName)
}

val singri = new Employee("Singri", None, "Keerthi")

val result = singri match {
  case Employee("Singri", None, x) ⇒
    "Yay, Singri %s! with no middle name!".format(x)
  case Employee("Singri", Some(x), _) ⇒
    "Yay, Singri with a middle name of %s".format(x)
  case _ ⇒ "I don't care, going on break"
}

val value = ""
value.isEmpty