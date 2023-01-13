package jojo.calculator

object Calculator {

  def main(args: Array[String]): Unit = {
    println("Valid operators -> +, -, *, /")
    print("Value:        ")
    val value1 = scala.io.StdIn.readDouble()
    print("Operator: ")
    val operator = scala.io.StdIn.readChar()
    print("Value:        ")
    val value2 = scala.io.StdIn.readDouble()

    operator match {
      case '+' => print(value1 + value2)
      case '-' => print(value1 - value2)
      case '*' => print(value1 * value2)
      case '/' =>
        if(value2 != 0) print(value1 / value2) else println("Impossible divide by Zero")
      case _ => print("Invalid Operator")
    }
  }
}
