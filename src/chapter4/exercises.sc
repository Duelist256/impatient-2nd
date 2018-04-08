// 1
val gizmos = Map("car" -> 50000, "PC" -> 2000, "book" -> 30)
val gizmosWithDiscount = gizmos.map(g => g._1 -> g._2 * 0.9)

// 2
case class Person(age: Int) {
  require(age >= 18)
}
Person(18)