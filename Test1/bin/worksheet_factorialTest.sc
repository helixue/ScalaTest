object worksheet_factorialTest {

  //@annotation.tailrec
  def factorial(n: Int, m:Int): Int =
     if  (n <= 0) m
     else factorial(n - 1, m * n)                 //> factorial: (n: Int, m: Int)Int
     
   factorial(5, 1)                                //> res0: Int = 120
   
}