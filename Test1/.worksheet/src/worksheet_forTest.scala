object worksheet_forTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 

  val l = List("Monday", "Tuesday", "Wednesday");System.out.println("""l  : List[String] = """ + $show(l ));$skip(51); 
 
  for (
    s <- l   //generator
  ) println(s);$skip(67); 

  for {
    s <- l
    if (s.length > 6) //filter
  } println(s);$skip(117); 
  
  val result_for = for {
    s <- l
    s1 = s.toUpperCase()  //variable binding
    if (s1 != "")
  } yield (s1);System.out.println("""result_for  : List[String] = """ + $show(result_for ))}

}
