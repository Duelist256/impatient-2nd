import scala.collection.immutable.SortedMap

val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
scores.getOrElse("Kek", 0)

val scores2 = scala.collection.mutable.Map("second" -> 5)
//scores2("first") = 10 // why it doesn't work??
scores2.update("first", 4)
scores2.update("second", 7)
scores2

val sortedScores = SortedMap("Alice" -> 10,
  "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)