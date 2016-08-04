object worksheet_ListTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  //基本用法
  val a = List(1, 2, 3);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(21); 
  
  val b = 0 :: a;System.out.println("""b  : List[Int] = """ + $show(b ));$skip(39); 
  
  val c = "x" :: "y" :: "z" :: Nil;System.out.println("""c  : List[String] = """ + $show(c ));$skip(21); 
  
  val z = a ::: c;System.out.println("""z  : List[Any] = """ + $show(z ));$skip(12); val res$0 = 
  
  a.head;System.out.println("""res0: Int = """ + $show(res$0));$skip(12); val res$1 = 
  
  c.tail;System.out.println("""res1: List[String] = """ + $show(res$1));$skip(15); val res$2 = 
  
  a.isEmpty;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(17); val res$3 = 
  
  Nil.isEmpty;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(126); 
  
  def walkthru(l: List[Int]): String = {
    if(l.isEmpty) ""
      else
      l.head.toString + "" + walkthru(l.tail)
  };System.out.println("""walkthru: (l: List[Int])String""");$skip(14); val res$4 = 
  walkthru(a);System.out.println("""res4: String = """ + $show(res$4));$skip(37); val res$5 = 
  //高级用法
  a.filter(x => x % 2 == 1);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(30); val res$6 = 
  
  "99 Red Balloons".toList;System.out.println("""res6: List[Char] = """ + $show(res$6));$skip(64); val res$7 = 
  
  "99 Red Balloons".toList.filter(x => Character.isDigit(x));System.out.println("""res7: List[Char] = """ + $show(res$7));$skip(83); val res$8 = 
  //takeWhile为True，继续拿值，False终止
  "99 Red Balloons".toList.takeWhile(x => x!= 'B');System.out.println("""res8: List[Char] = """ + $show(res$8));$skip(60); val res$9 = 
  
  //List-Map,做映射，相当于变量每个元素然后做相应的操作
  a.filter(_ % 2 ==1);System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(34); val res$10 = 
  a.filter(_ % 2 ==1).map(_ + 10);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(33); 
  
  val q = List(a, List(5, 6));System.out.println("""q  : List[List[Int]] = """ + $show(q ));$skip(32); val res$11 = 
  q.map( _.filter( _ % 2 == 0));System.out.println("""res11: List[List[Int]] = """ + $show(res$11));$skip(36); val res$12 = 
  q.flatMap( _.filter( _ % 2 == 0));System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(50); val res$13 = 
  
  //ReduceLeft
  a.reduceLeft((x, y) => x + y);System.out.println("""res13: Int = """ + $show(res$13));$skip(20); val res$14 = 
  a.reduce( _ + _ );System.out.println("""res14: Int = """ + $show(res$14));$skip(37); val res$15 = 
  //foldLeft
  a.foldLeft(0)( _ + _);System.out.println("""res15: Int = """ + $show(res$15));$skip(24); val res$16 = 
  a.foldLeft(1)( _ * _);System.out.println("""res16: Int = """ + $show(res$16));$skip(19); val res$17 = 
  
  1 to 10 by 2;System.out.println("""res17: scala.collection.immutable.Range = """ + $show(res$17));$skip(24); val res$18 = 
  (1 to 10 by 2).toList;System.out.println("""res18: List[Int] = """ + $show(res$18));$skip(12); val res$19 = 
  1 until 5;System.out.println("""res19: scala.collection.immutable.Range = """ + $show(res$19));$skip(48); 
  //Map
  val p = Map(1 -> "David", 9 ->"lili");System.out.println("""p  : scala.collection.immutable.Map[Int,String] = """ + $show(p ));$skip(7); val res$20 = 
  p(1);System.out.println("""res20: String = """ + $show(res$20));$skip(16); val res$21 = 
  p.contains(1);System.out.println("""res21: Boolean = """ + $show(res$21));$skip(9); val res$22 = 
  p.keys;System.out.println("""res22: Iterable[Int] = """ + $show(res$22));$skip(11); val res$23 = 
  p.values;System.out.println("""res23: Iterable[String] = """ + $show(res$23));$skip(18); val res$24 = 
  p + (8 -> "dd");System.out.println("""res24: scala.collection.immutable.Map[Int,String] = """ + $show(res$24));$skip(8); val res$25 = 
  p - 8;System.out.println("""res25: scala.collection.immutable.Map[Int,String] = """ + $show(res$25));$skip(34); val res$26 = 
  p ++ List(2 -> "cc", 5 -> "dd");System.out.println("""res26: scala.collection.immutable.Map[Int,String] = """ + $show(res$26));$skip(18); val res$27 = 
  p -- List(2, 5);System.out.println("""res27: scala.collection.immutable.Map[Int,String] = """ + $show(res$27))}
}
