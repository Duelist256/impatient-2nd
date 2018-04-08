package chapter3

import java.awt.datatransfer._
import java.util

import scala.collection.mutable.ArrayBuffer
import scala.collection.{JavaConverters, mutable}

object Exercise11 extends App {
  val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  private val strings: util.List[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  private val scalaBuffer = JavaConverters.asScalaBuffer(strings)

  for (elem <- scalaBuffer) {
    println(elem)
  }
}
