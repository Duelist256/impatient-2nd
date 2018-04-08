import scala.collection.immutable.Stream.cons

val set = Set(1, 3, 4, 6)
val result = set.map(_ * 4)
set.last
set.lastOption

val list = List(1, 2, 3, 4, 5)
val result2 = list.flatMap(it ⇒ if (it % 2 == 0) Some(it) else None)

// toStream will convert any Traversable to a Stream which is a lazy list
// where elements are evaluated as they are needed:
val list3 = List(4, 6, 7, 8, 9, 13, 14)
val result3 = list3.toStream
result.isInstanceOf[Stream[_]]
(result take 3)

List(5 -> "6", 5 -> "7").toMap

def streamer(v: Int): Stream[Int] = cons(v, streamer(v + 1))
val a = streamer(2)
(a take 3 toList)