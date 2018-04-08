
// 1
// According to the precedence rules, how are 3 + 4 -> 5 and 3 -> 4 + 5 evaluated?
// (3 + 4) -> 5 and 3 -> (4 + 5)

// 2. The BigInt class has a pow method, not an operator.
//    Why didn’t the Scala library designers choose ** (as in Fortran)
//    or ^ (as in Pascal) for a power operator?
BigInt(5).pow(10)
// because it is inherited from Java's class BigInteger maybe ...
// But it is precedence by name

case class EventId(id: Long)
