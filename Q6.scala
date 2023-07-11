import scala.io.StdIn
object Fibonacci {

def fibonacci(n: Int): Int = {
    if (n <= 1)
      n
    else
      fibonacci(n - 1) + fibonacci(n - 2)
  }

def main(args: Array[String]): Unit = {
    print("Enter n:")
    val n = StdIn.readInt()

    print(s"First $n Fibonacci Numbers are:")
    for (i <- 0 until n) {
      print(fibonacci(i)+ ",")
    }
  }
}
