package chapter4



import java.util
import java.util.Properties

import scala.collection.JavaConverters._
import scala.collection.mutable

object Exercise7 extends App {

  private val properties: Properties = System.getProperties
  private val propertyKeys: mutable.Set[String] = properties.stringPropertyNames().asScala
  private val maxLengthProperty: Int = propertyKeys.maxBy(_.length).length

  println(maxLengthProperty)

  for (elem <- propertyKeys) {
    println(f"$elem%-29s | ${properties.getProperty(elem)}")
  }


}
