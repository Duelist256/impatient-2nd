package chapter11

class Matrix {

  var array = new Array[Array[Int]](0)

  def this(m: Int, n: Int) {
    this()
    array = new Array[Array[Int]](m)
    for (i <- array.indices) {
      array(i) = new Array[Int](n)
    }
  }


  def this(array: Array[Array[Int]]) {
    this(array.length, array(0).length)
    this.array = array
  }


  def +(other: Matrix): Matrix = {
    if (!isSameSize(other)) throw new IllegalArgumentException("Matrices should have same size")

    val newArray = new Array[Array[Int]](array.length)
    val colSize = other.array(0).length

    for (i <- newArray.indices) {
      newArray(i) = new Array[Int](colSize)
    }

    for (i <- array.indices) {
      for (j <- array(i).indices) {
        newArray(i)(j) = array(i)(j) + other.array(i)(j)
      }
    }
    new Matrix(newArray)
  }

  def isSameSize(other: Matrix): Boolean = {
    array.length == other.array.length && array(0).length == other.array(0).length
  }

  override def toString: String = {
    val sb = new StringBuilder
    for (i <- array.indices) {
      for (j <- array(i).indices) {
        sb.append(array(i)(j)).append(" ")
      }
      sb.append("\n")
    }
    sb.toString()
  }
}

object Exercise8 extends App {
  val arr = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
  val arr2 = Array(Array(9, 8, 7), Array(6, 5, 4), Array(3, 2, 1))
  val m = new Matrix(arr)
  val m2 = new Matrix(arr2)
  println(m + m2)
}
