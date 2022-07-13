package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: BigInt): BigInt = {
    if (n == 1) {
      println("computed factorial of " + n + " which is 1 - can now find factorial of " + (n + 1))
      1
    }
    else {
      println("computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val res = n * factorial(n - 1)
      println("Computed factorial of " + n + " which is " + res + " - can now find factorial of " + (n + 1))

      res
    }
  }

}

object Exercises {
  /*================================================================
    Write tail-recursive functions to accomplish the following tasks
  ================================================================*/

  /*===========================================
    1. concatenate a string to itself `n` times
   ==========================================*/
  def concatenate(s: String, times: Int): String = {
    @tailrec
    def recurseConcat(i: Int, accu: String): String = {
      if (i == 1) accu + s
      else recurseConcat(i-1, accu + s)
    }

    recurseConcat(times, "")
  }

  /*==========================================
  2. determine whether a given number is prime
 ===========================================*/
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

  /*================================
  3. find the `nth` fibonacci number
 =================================*/
  def fibonacci(n: BigInt): BigInt = {
    if (n < 2) return 1

    @tailrec
    def getFibonacci(x: BigInt, prior: BigInt, fib: BigInt): BigInt = {
      if (x == n) prior + fib
      else getFibonacci(x+1, fib, prior + fib)
    }

    getFibonacci(2, 0, 1)
  }

  /*================================
    3. calculate the factorial of `n`
  =================================*/
  def factorial(x: Int, calculatedfactorial: Int): Int = {
    if (x <= 0) calculatedfactorial
    else factorial(x-1, calculatedfactorial * x)
  }
}

object Solutions extends App {
  println(Exercises.concatenate("hello ", 3))
  println(Exercises.isPrime(391017107))
  println(Exercises.fibonacci(3))
  println(Exercises.factorial(6, 1))
}





