package chapter6

object Exercise5 extends App {
  for (i <- args.length - 1 to 0 by -1) {
    print(s"${args(i)}")
  }
}
