object worksheet_tryAndmatch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(163); 

  val result_try = try {
    Integer.parseInt("dog")
  } catch {
    case _ => 0
  } finally {
    println("alway be printed")
  };System.out.println("""result_try  : Int = """ + $show(result_try ));$skip(17); 

  val code = 3;System.out.println("""code  : Int = """ + $show(code ));$skip(101); 
  val result_match = code match {
    case 1 => "one"
    case 2 => "two"
    case _ => "others"
  };System.out.println("""result_match  : String = """ + $show(result_match ))}
}
