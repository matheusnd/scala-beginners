package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 52
  println(x)
  // VALS are immutable, works as contansts
  // Types of val are optional. The compiler can infer types

  val aString: String = "Hello"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  // Char must be defined with single quote

  val aInt: Int = 1231231231
  val aLong: Long = 12123123123222L
  val aShort: Short = 12123
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables in Scala
  var aVariable: Int = 10
  println(aVariable)
  // variables can be reassigned
  aVariable = 2 // side effects
  println(aVariable)
}
