import scala.io.StdIn

object EvenSum{
    def evenSum(n: Int): Int = {
    if (n == 0)
        return 0
    else if (n % 2 == 0) 
        return (n + evenSum(n - 2))
    else evenSum(n - 1)
    }

    def main(args: Array[String]): Unit = {
    print("Enter n:")
    val n = StdIn.readInt()
    println(s"Addition of all even numbers less than $n is " + evenSum(n))
    }
}

