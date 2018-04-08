import scala.collection.mutable.ArrayBuffer

val array = Array(1, 7, 2, 9)
array.sum
array.toString

val arrayBuffer = ArrayBuffer(1, 3, 4, 5)
arrayBuffer.toString
val newArrayBuffer = arrayBuffer += 3
newArrayBuffer.sorted
val descArrayBuffer = newArrayBuffer.sortWith(_ > _)
val ascArrayBuffer = newArrayBuffer.sortWith(_ < _)
ascArrayBuffer.mkString("[","|" , "]")
descArrayBuffer.mkString(":")

ArrayBuffer('a', 'b') ++: "cd"

val matrix = Array.ofDim[Double](3, 4)
matrix(0)(0) = 4.2
