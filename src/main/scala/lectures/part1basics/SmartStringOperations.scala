package lectures.part1basics

object SmartStringOperations extends App {

  val str: String = "hello, I am learning Scala"

  //  get character from String at `x` index
  println(str.charAt(1))

  //  get substring from String, beginning at 0, up to index 5 NOT inclusive
  println(str.substring(0, 5))
  //  get substring from String, beginning at 5, to end of string
  println(str.substring(5))

  //  get array by splitting String at specified delimiter; use toList to make the array human-readable
  println(str.split(" ").toList)
  //  get array by splitting String at specified delimiter; use mkString to get human-readable output
  //    mkString displays all elements of this collection in a string using start, end, and separator strings.
  println(str.split(" ").mkString("", "  --  ", ""))

  //  test whether String begins with specified String
  println(str.startsWith("hello"))
  println(str.startsWith("bye-bye"))

  //  String replacement
  println(str.replace(",","").replace(" ", " -- "))

  //  convert String to lower/upper-case
  println(str.toLowerCase())
  println(str.toUpperCase())

  //  access length property of String
  println(str.length)

  //  convert String representation of an Int to an Int
  val aNumberString = "56"
  val aNumber = aNumberString.toInt

  // Scala specific

  //  append and prepend Chars to Strings
  println('a' +: "lpha&omeg" :+ 'a')

  //  reverse a String
  println(str.reverse)

  //  take `x` characters from a String
  println(str.take(2))
  println(str.take(11))

  //  s-interpolators
  var name = "David"
  var age = 12
  var greeting = s"hello, I am $age, and my name is $name"
  println(greeting)
  println(s"hello, my name is $name and I am $age years old")
  println(s"hello, my name is ${'N' +: "athan"} and I am ${age + 16} years old")

  //  f-interpolators
  /*
      for using String formatters
      % specifies type/format
        %s == String
        %2.2f == float with 2 characters total minimum, and 2 decimal precision
      will perform type checking at compile time
  */
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  println(raw"this is a \n newline")
  val escaped = "this is a \n newline"
  println(raw"$escaped")
}
