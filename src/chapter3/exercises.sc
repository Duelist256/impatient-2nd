import scala.collection.mutable.ArrayBuffer
import scala.util.Random

// 1
val a = new scala.Array[Int](10)
for (i <- 0 until a.length) {
  a(i) = Random.nextInt(a.length)
}
for (elem <- a) {
  print(elem + " ")
}

// 2
val orig = Array(1, 2, 3, 4, 5)
for (i <- 0 until orig.length - 1 by 2) {
  val temp = orig(i)
  orig(i) = orig(i + 1)
  orig(i + 1) = temp
}
for (elem <- orig) { print(elem + " ") }

// 3
val orig2 = Array(1, 2, 3, 4, 5)
val temp = for {
  i <- 0 until orig2.length - 1 by 2
} yield Array(orig2(i + 1), orig2(i))
var seq = temp.flatten

val newArray = ArrayBuffer(seq: _*)
if (orig2.length % 2 == 1) newArray += orig2(orig2.length - 1)
newArray

// 4
val ints = Array(1, 2, -1, 4, 0, -5, 7, -8)
val buffer =
  ArrayBuffer(ints.filter(_ > 0 ): _*) ++= ArrayBuffer(ints.filter(_ <= 0 ): _*)
for (elem <- buffer) {
  println(elem)
}

// 5
val doubles = Array(1.0, 2.0, 4.0, 7)
doubles.sum / doubles.length

// 6
val ints2 = Array(1, 2, -1, 4, 0, -5, 7, -8)
ints2.sortWith(_ > _)
ints2.sorted.reverse
val ints2buff = ArrayBuffer(1, 2, -1, 4, 0, -5, 7, -8)
ints2buff.sortWith(_ > _)
ints2buff.sorted.reverse

// 7
val ints3 = Array(1, 1, 2, -1, 4, 0, -5, 2, 1, 7)
ints.distinct