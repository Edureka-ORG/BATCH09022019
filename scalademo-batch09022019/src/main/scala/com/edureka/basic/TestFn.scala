package com.edureka.basic

object TestFn {
  
  def sayHello() = {
      println("Hello")
    }
  def sayHello(st:String) = {
      println("Hello")
    }
      
    def sayHello2(msg:String="Tes") = {
      println(s"Hello $msg");
    }
    
    def add(a:Int=0, b:Int=0):Int = {
      a+b;
    }
    
    
    def fact(x:Int):Int = {
      if(x==0) return 1;
      x+fact(x-1);
    }
    
    def printArea(x:Int , y:Int){
      var z = x*y;
      println(z)
    }
  def main(args: Array[String]): Unit = {
   sayHello();
   sayHello2("AAA");
   sayHello2();
   var f = fact(7)
   println(f)
   
   add()
   add(10)
   add(20,30)
   add(b=20)
   add(b=20,a=10)
   
   testInside
   def testInside(){
     println("Inside");
   }
   
   printArea(20,30)
  }
}