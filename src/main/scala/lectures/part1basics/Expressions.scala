package lectures.part1basics

//  extending the App trait makes this object an executable program
//    no main function is needed, as the entire class body acts as the main program
object Expressions extends App {
  val x = 1 + 2 // `1 + 2` is an expression
  // expressions are evaluated to a value and have a type; here, Int
  println(x)
  println(2 + 3 * 2)
  // + - * / & | ^ << >> >>>

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 1
  println(aVariable)
  // -= *= /=   only work on `var`s;  side effects

  /*
    Instructions (statements) vs Expressions

    - Instructions are things you tell the computer to DO
    - Expressions are things that have values and/or types

    EVERYTHING IN SCALA IS AN EXPRESSION

    e.g.
      in Scala, conditional `if` is an EXPRESSION rather than a statement!
      `if` returns a value
  */

  val aCondition = true
  val aConditionedValue = if (aCondition) "true" else "false"

  println(if (!aCondition) 5 else 8)

  //  looping is HIGHLY discouraged in Scala. Loops are not expressions, do not return anything
  //    meaningful, and produce side effects
  var i = 0
  var aWhile: Unit = while (i < 10) {
    println(i)
    i += 1
  }
  // don't ever write the above code in Scala again!
  // looping in general is specific to imperative programming. Don't write imperative code in scala

  val weirdValue: Unit = (aVariable = 3) // `Unit` is like void in Java
  // the only value a Unit can hold is ()
  println(weirdValue)
  // reassigning a variable in scala is a side effect.
  // A SIDE EFFECT is an expression that returns a Unit
  // Notice, the value returned by a `while` loop is also Unit
  // Unit: println(), while, reassignment

  //  Code Blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "bye"
  }


  /*
    code blocks, like everything in Scala is an expression.

    you can do whatever computation you like inside, and the value/type of the code block will be
      determined by the last expression in the block

    values initialized within code blocks are not available outside of the code block
  */



  /////////  quiz

  // 1. whats the difference between "hello world" and println("hello world")?
  println("\"hello world\" is a String with the value of 'hello world'; println(\"hello world\") is and expression, and side effect, which returns a Unit. It's side effect is that it prints to the console")
  // 2. whats the value of
  val thisValue = {
    2 < 3
  }
  print("the value of thisValue is a true Boolean ")
  println(thisValue)
  // 3. whats the value of
  val thisOtherValue = {
    if (thisValue) 238 else 907
    42
  }
  print("the value of thisOtherValue is 42 ")
  println(thisOtherValue)
}
