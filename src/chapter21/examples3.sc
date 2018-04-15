case class Delimiters(left: String, right: String)

def quote(what: String)(implicit delims: Delimiters) =
  delims.left + what + delims.right

quote("Bonjour le monde")(Delimiters("«", "»"))

object FrenchPunctuation {
  implicit val quoteDelimiters = Delimiters("«", "»")
}

{
  import FrenchPunctuation._
  quote("LOL")
}

42 -> "kek"

// 2.7. Implicit conversions with implicit parameters
def smaller[T](a: T, b: T)(implicit order: T => Ordered[T])
= if (a < b) a else b // Calls order(a) < b if a doesn’t have a < operator

// 2.8 Context bound
class Pair[T : Ordering](val first: T, val second: T) {
  def smaller(implicit ord: Ordering[T]) =
    if (ord.compare(first, second) < 0) first else second
}

new Pair(40, 2)
//new Pair(40, new StringBuilder)