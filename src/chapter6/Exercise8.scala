package chapter6

object RGBColors extends Enumeration {
  type RGBColors = Value
  val Red       = Value("0xff0000")
  val Green     = Value("0x00ff00")
  val Blue      = Value("0x0000ff")
  val RedGreen  = Value("0xffff00")
  val RedBlue   = Value("0xff00ff")
  val GreenBlue = Value("0x00ffff")
  val Black     = Value("0x000000")
  val White     = Value("0xffffff")
}

object Exercise8 extends App {

  println(RGBColors.Red)
  println(RGBColors.Green)
  println(RGBColors.Blue)
  println(RGBColors.RedGreen)
  println(RGBColors.RedBlue)
  println(RGBColors.GreenBlue)
  println(RGBColors.Black)
  println(RGBColors.White)
}
