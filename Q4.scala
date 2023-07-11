import scala.io.StdIn

object EvenOdd {
  def evenOdd(n: Int): Unit = {
    if (n == 0)
        println("Even")
    else if (n == 1) 
        println("Odd")
    else evenOdd(n - 2)
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number:")
    val n = StdIn.readInt()
    print(s"$n is ")
    evenOdd(n)
  }
}
