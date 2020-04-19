package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 //expression
  println(x)

  println(2 + 3 * 4)
  // arithmetic operators
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && || logical operators

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= -> these are side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
  val aCondition = true
  val aConditionvalue = if(aCondition) 5 else 3 // if expression
  println(aConditionvalue)
  println(if(aCondition) 5 else 3)
  println(1 +3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  // NEVER USE a loop like this. This kind of loop is used in imperative languages (java, c , python)
  // Everything in Scala is an Expression

  val aWeirdValue = (aVariable = 3) // returns a Unit == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning vars

  // Code blocks

  // the code block can contain its own val definitions
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  println(aCodeBlock)

}
