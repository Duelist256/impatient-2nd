class StringInt(val str: String, val int: Int) {
  def +(stringInt: StringInt): StringInt = {
    new StringInt(str + stringInt.str, int + stringInt.int)
  }
}

val s1 = new StringInt("Lol, ", 14)

implicit def intToStringInt(int: Int): StringInt = new StringInt("default", int)

val res = s1 + 2
res.int
res.str