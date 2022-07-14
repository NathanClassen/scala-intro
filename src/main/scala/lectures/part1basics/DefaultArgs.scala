package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  @tailrec
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  def savePic(format: String = "jpg", w: Int, h: Int): Unit = println("photo saved with format: " + format + " and res: " + w + "x" + h)


  def aFunction(x: Int, a: String = "hello ") = println(a + "  " + x)

  aFunction(4)
}
