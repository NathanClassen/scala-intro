package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  //calledByValue(System.nanoTime()) // here, we pass the value of System.nanoTime() to calledByValue
  //calledByName(System.nanoTime()) // here, we pass the expression System.nanoTime() to calledByName

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(34, infinite()) // this will not cause stack overflow because `infinite()` will never be evaluated

  def execution() = {
    println("1.   execution has occurred")
    8
  }

  def executor(x: => Int) = {
    println("2.   executor is invoked")
    println("3.   x is: " + x)
  }

  executor(execution())

}
