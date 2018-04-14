class StringInt(val str: String, val int: Int) {
  def +(stringInt: StringInt): StringInt = {
    new StringInt(str + stringInt.str, int + stringInt.int)
  }

  def doSmth(): Unit = {
    println("I'm doing something")
  }
}

val s1 = new StringInt("Lol, ", 14)

implicit def intToStringInt(int: Int): StringInt =
  new StringInt("default", int)

val res = s1 + 2
res.int
res.str

2 doSmth()

implicit class DoSmth(val i: Int)
//  extends AnyVal // why it doesn't compile? =(
{
  def printValue(): String = {
    s"Value=$i"
  }
}

2 printValue

