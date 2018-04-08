import java.io.IOException

import scala.annotation.strictfp
import scala.beans.BooleanBeanProperty
import scala.collection.mutable

@volatile var done = false
@transient var recentLookups = new mutable.HashMap[String, String]
@strictfp def calculate(x: Double) = ???
@native def win32RegKeys(root: Int, path: String): Array[String]

// @cloneable class Employee
@SerialVersionUID(6157032470129070425L)
class Person


class Test(@BooleanBeanProperty var boolean: Boolean)
val test = new Test(true)
test.isBoolean
test.setBoolean(false)