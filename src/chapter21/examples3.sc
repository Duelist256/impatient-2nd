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