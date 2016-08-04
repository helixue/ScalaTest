object worksheet_tryAndmatch {

  val result_try = try {
    Integer.parseInt("dog")
  } catch {
    case _ => 0
  } finally {
    println("alway be printed")
  }                                               //> alway be printed
                                                  //| result_try  : Int = 0

  val code = 3                                    //> code  : Int = 3
  val result_match = code match {
    case 1 => "one"
    case 2 => "two"
    case _ => "others"
  }                                               //> result_match  : String = others
}