

object Factorial {
  
  def main(args: Array[String]): Unit = {
    
    val n = 5;
    println("The Factorial of " + n + " is " + fact(n))
    
    def fact(n: Int): Int = {
    if(n<=1)
      1;
    else
      n * fact(n-1)
  }
  }
}
