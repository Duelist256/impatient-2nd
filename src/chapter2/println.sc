val name = "Sobaka"
println(s"I am ... \n${name}")
println(raw"I am \n ${name}")

val kek = 5
val result = for  {
  kek <- 1 to 5
} yield kek
