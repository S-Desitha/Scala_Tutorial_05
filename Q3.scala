object  Sum {

    def sum(n: Int): Int = {
     if (n == 0) 
        return 0
     else 
        return n + sum(n - 1)
    }

    def main(args: Array[String]): Unit = {
    println(sum(5))
}

}