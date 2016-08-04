object worksheet_sumTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(294); 
  
  def sum(f: Int => Int)(a: Int)(b: Int): Int = {
  
  def loop(n: Int, acc: Int): Int = {
    if (n > b) {
       println(s"n=${n}, acc=${acc}")
       acc
    }else {
       println(s"n=${n}, acc=${acc}")
       loop(n + 1, acc + f(n))
    }
  }
  loop(a, 0)
  };System.out.println("""sum: (f: Int => Int)(a: Int)(b: Int)Int""");$skip(24); val res$0 = 
  
  sum(x => x)(1)(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(36); 
   val sumSquare = sum(x => x * x)_;System.out.println("""sumSquare  : Int => (Int => Int) = """ + $show(sumSquare ));$skip(19); val res$1 = 
   sumSquare(1)(5);System.out.println("""res1: Int = """ + $show(res$1))}
}
