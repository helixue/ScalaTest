object worksheet_factorialTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(149); 

  //@annotation.tailrec
  def factorial(n: Int, m:Int): Int =
     if  (n <= 0) m
     else factorial(n - 1, m * n);System.out.println("""factorial: (n: Int, m: Int)Int""");$skip(25); val res$0 = 
     
   factorial(5, 1);System.out.println("""res0: Int = """ + $show(res$0))}
   
}
