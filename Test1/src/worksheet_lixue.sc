object worksheet_lixue {

  def hello(name: String): String = {

    s"hello, ${name}"

  }                                               //> hello: (name: String)String

  hello("Lixue")                                  //> res0: String = hello, Lixue

  def hello2(name: String) = {

    s"hello, ${name}"

  }                                               //> hello2: (name: String)String
  
  hello2("Scala")                                 //> res1: String = hello, Scala

  def add(x:Int, y:Int) = x + y                   //> add: (x: Int, y: Int)Int
  
  add(1 , 2)                                      //> res2: Int = 3
  
}