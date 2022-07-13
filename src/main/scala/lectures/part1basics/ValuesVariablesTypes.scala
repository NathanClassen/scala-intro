package lectures.part1basics

object ValuesVariablesTypes extends App {

  // values
  // `vals` are immutable
  val x: Int = 42
  println(x)
  //  type specification is optional; compiler can infer from right-hand side
  //  in fact, in practice, the type is usually not specified
  val y = 43
  println(y)

  val aString: String = "hello world"

  val aBoolean: Boolean = true

  val aChar: Char = 'a'

  val anInt: Int = x
  val aShort: Short = 32767
  val aLong: Long = 992847657378385999L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables
  // `vars` are immutable
  var aVariable: Int = 4

  aVariable = 5
  println(aVariable)
  aVariable += 1
  println(aVariable)
}
