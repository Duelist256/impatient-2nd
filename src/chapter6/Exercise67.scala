package chapter6

object CardSuits extends Enumeration {
  type CardSuits = Value
  val Spade  = Value("♠")
  val Heart = Value("♥")
  val Club = Value("♣")
  val Diamond = Value("♦")

  def isRed(cardSuit: CardSuits): Boolean = cardSuit == Heart || cardSuit == Diamond
}

object Exercise67 extends App {
  import chapter6.CardSuits._

  println(Spade)
  println(Heart)
  println(Club)
  println(Diamond)

  println(isRed(Spade))
  println(isRed(Heart))
  println(isRed(Club))
  println(isRed(Diamond))
}