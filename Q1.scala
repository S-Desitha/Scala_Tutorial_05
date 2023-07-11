object Prime_Nmb {

def prime(n: Int, i: Int = 2): Boolean = 
{
    if (n <= 2) 
        {
        if (n == 2) true 
        else false
        }
    else
        {
        if (n % i == 0) false
        else if (i * i > n) true
             else prime(n, i + 1)
        }
}
def main(args: Array[String]): Unit = {
    println(prime(1))
    println(prime(2))
    println(prime(3))
    println(prime(5))  
    println(prime(8))   
  }
}




