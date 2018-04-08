class Pair[T, S](val first: T, val second: S)

val p = new Pair(42, "String")
val p2 = new Pair[Any, Any](42, "String")

def getMiddle[T](a: Array[T]) = a(a.length / 2)
getMiddle(Array("Mary", "had", "a", "little", "lamb"))
val f = getMiddle[String] _
f(Array("kek"))

class Pair2[T <: Comparable[T]](val first: T, val second: T) {
  def smaller = if (first.compareTo(second) < 0) first else second
}

val p3 = new Pair2("Fred", "Brooks")
//val p4 = new Pair2(1, 2) // doesn't compile

class PairWithReplace[T <: Comparable[T]](val first: T, val second: T) {
  def smaller = if (first.compareTo(second) < 0) first else second
  def replaceFirst(newFirst: T) = new PairWithReplace[T](newFirst, second)
}

//val pwp = new PairWithReplace(1, 2) // doesn't compile
val pwp = new PairWithReplace("sfs", "wsfv")
pwp.replaceFirst("abc")


class Pair3[T <% Comparable[T]](val first: T, val second: T)

class Pair4[T](val first: T, val second: T)(implicit ev$1: T => Comparable[T]) // same as Pair3

class Pair5[T: Comparable](val first: T, val second: T) {
  def smaller(implicit ord: Ordering[T]) = if (ord.compare(first,second) < 0) first else second
}

//
val friends = Map("Fred" -> "Barney")
val friendOpt = friends.get("Wilma") // An Option[String]
val friendOrNull = friendOpt.orNull // A String or null

def firstLast[A, C](it: C)(implicit ev: C <:< Iterable[A]) =
  (it.head, it.last)
firstLast(List(1, 2, 3))

// variance

trait Friend[-T] {
  def befriend(someone: T)
}

class Person extends Friend[Person] {
  override def befriend(someone: Person): Unit = ???
}
class Student extends Person

def friends(students: Array[Student], find: Function1[Student, Person]) =
  for (s <- students) yield find(s)

def studentToPerson(student: Student): Person = new Person
def personToStudent(person: Person): Student = new Student

friends(Array(new Student), studentToPerson)
friends(Array(new Student), personToStudent)


//class CovariantPair[+T](var first: T, var second: T) // Error

class CovariantPair[+T](val first: T, val second: T) {
//  def replaceFirst(newFirst: T) = new CovariantPair[T](newFirst, second) // Error
}