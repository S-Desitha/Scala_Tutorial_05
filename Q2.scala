object PrimeSeq {

  def prime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2) {
      if (n == 2) true else false
    } else {
      if (n % i == 0) false
      else if (i * i > n) true
      else prime(n, i + 1)
    }
  }

  def primeSeq(n: Int): Unit = {
    for (i <- 2 to n) {
      if (prime(i)) {
        println(i)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

}
