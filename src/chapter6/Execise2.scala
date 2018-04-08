package chapter6

abstract class UnitConversion {
  def convert(total: Double): Double
}

object InchesToCentimeters extends UnitConversion {
  override def convert(inches: Double): Double = inches * 2.54
}

object GallonsToLiters extends UnitConversion {
  override def convert(gallons: Double): Double = gallons * 3.78541
}

object MilesToKilometers extends UnitConversion {
  override def convert(miles: Double): Double = miles * 1.60934
}

object Execise2 {
  def main(args: Array[String]): Unit = {
    println(InchesToCentimeters.convert(5))
    println(GallonsToLiters.convert(5))
    println(MilesToKilometers.convert(5))
  }
}
