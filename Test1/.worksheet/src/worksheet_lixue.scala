object worksheet_lixue {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 

  def hello(name: String): String = {

    s"hello, ${name}"

  };System.out.println("""hello: (name: String)String""");$skip(19); val res$0 = 

  hello("Lixue");System.out.println("""res0: String = """ + $show(res$0));$skip(63); 

  def hello2(name: String) = {

    s"hello, ${name}"

  };System.out.println("""hello2: (name: String)String""");$skip(22); val res$1 = 
  
  hello2("Scala");System.out.println("""res1: String = """ + $show(res$1));$skip(33); 

  def add(x:Int, y:Int) = x + y;System.out.println("""add: (x: Int, y: Int)Int""");$skip(17); val res$2 = 
  
  add(1 , 2);System.out.println("""res2: Int = """ + $show(res$2))}
  
}
