object worksheet_sumTest {
  
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
  }                                               //> sum: (f: Int => Int)(a: Int)(b: Int)Int
  
  sum(x => x)(1)(5)                               //> n=1, acc=0
                                                  //| n=2, acc=1
                                                  //| n=3, acc=3
                                                  //| n=4, acc=6
                                                  //| n=5, acc=10
                                                  //| n=6, acc=15
                                                  //| res0: Int = 15
   val sumSquare = sum(x => x * x)_               //> sumSquare  : Int => (Int => Int) = <function1>
   sumSquare(1)(5)                                //> n=1, acc=0
                                                  //| n=2, acc=1
                                                  //| n=3, acc=5
                                                  //| n=4, acc=14
                                                  //| n=5, acc=30
                                                  //| n=6, acc=55
                                                  //| res1: Int = 55
}