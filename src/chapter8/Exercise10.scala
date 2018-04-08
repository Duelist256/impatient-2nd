package chapter8

object Exercise10 extends App {

  // 10. The file scala/collection/immutable/Stack.scala contains the definition
  //   class Stack[A] protected (protected val elems: List[A])
  // Explain the meanings of the protected keywords. (Hint: Review the discussion
  // of private constructors in Chapter 5.)

  class Stack[A] protected(protected val elems: List[A]) {
    def this() {
      this(Nil) // we can use our own constructor
    }
  }

//  private val value = new Stack[Int](List(1, 2, 3)) // can't get access

  //  value.elems // we can't get access if we not an heir


  class TipaModifiedStack[A] extends Stack[A](Nil) { // we can use protected constructor
//    private val elems2: List[A] = super.elems // Error:(18, 41) super may not be used on value elems
    val temp = elems // we can get acess from the heir to protected val
  }

}
