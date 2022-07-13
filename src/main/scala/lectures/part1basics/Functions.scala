package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

  // code also move the expression into a block (which is also an expression whose value is that value of the last line
  def aFunction(a: String, b: Int): String =
    a + " " + b

  def noParamFunction(): Int = 42

  println(aFunction("hello ", 3))
  println(noParamFunction())

  // WHEN YOU NEED LOOPS, USE RECURSION
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("how bout it? ", 10))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n)
  }

  def greeting(name: String, age: Int): String =
    "hi, my name is " + name + ", and I am " + age + " years old"

  println(greeting("Charlie", 3))

  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(8))


  /*
      number is prime if it's only two multiples are itself and 1

      start at number,
        ask whether each number below it divides into it equally
          if any but itself and 1 do, then the nubmer is not prime
  */


  def isPrime(n: Int): Boolean = {
    @tailrec
    def checkPrime(x: Int): Boolean = {
      if (x == 1) true
      else {
        if (n % x == 0) false
        else checkPrime(x - 1)
      }
    }

    checkPrime(n - 1)
  }


  print("9 is prime: ")
  println(isPrime(9))

  print("7 is prime: ")
  println(isPrime(391017107))

  def checkForPrimes(in: Int): Unit = {
    if (in > 1) {
      val res = isPrime(in)
      if (res) println(in + " is prime!")
      checkForPrimes(in - 1)
    } else println("is 1 prime?  true")
  }

  checkForPrimes(700000000)
}
