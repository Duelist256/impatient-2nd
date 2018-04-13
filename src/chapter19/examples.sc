
// structural type

def appendLines(target: { def append(str: String): Any },
                lines: Iterable[String]) {
  for (l <- lines) { target.append(l); target.append("\n") }
}

class A {
  def append(str: String): Any = new Any
}

class B {
}

val a = new A
val b = new B

appendLines(a, Nil)
//appendLines(b, Nil) // compile error

// 19.7 Infix Types

type x[A, B] = (A, B)
val ab: A x B = (a, b)

val aba: A x B x A= ((a, b), a)

// 19.8 Existential Types
import javax.swing.JComponent
def f(a: Array[T] forSome { type T <: JComponent }) = ???

// 19.10 Self Types
trait T[A] {
  this: Iterable[A] with Serializable =>
}

class Clazz extends T[String] with Iterable[String] {
  kek: Serializable => // we can escape it so or add it to declaration with "with"
  override def iterator = ???
}

// Cake pattern (DI)

trait LoggerComponent {
  trait Logger { }
  val logger: Logger
  class FileLogger(file: String) extends Logger { }
}
trait AuthComponent {
  this: LoggerComponent => // Gives access to logger
  trait Auth { }
  val auth: Auth
  class MockAuth(file: String) extends Auth { }
}

object AppComponents extends LoggerComponent with AuthComponent {
  val logger = new FileLogger("test.log")
  val auth = new MockAuth("users.txt")
}

// Higher-kinded type

trait Iterable[E, C[_]] {
  def iterator(): Iterator[E]
  def build[F](): C[F]
  def map[F](f : (E) => F) : C[F]
}
