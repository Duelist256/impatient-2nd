package chapter14

object Exercise6 extends App {

  sealed abstract class BinaryTree

  case class Leaf(value: Int) extends BinaryTree

  case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

  def sum(binaryTree: BinaryTree): Int = {
    binaryTree match {
      case Leaf(value) => value
      case Node(left, right) => sum(left) + sum(right)
    }
  }

  val node = Node(
              left = Node(Node(Leaf(5), Leaf(4)), Node(Leaf(2), Leaf(1))),
              right = Node(Node(Leaf(8), Leaf(1)), Node(Leaf(3), Leaf(4)))
            )
  println(sum(node))
}
