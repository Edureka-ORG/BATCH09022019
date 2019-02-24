package com.edureka.basic

object TestWhile {
  def main(args: Array[String]): Unit = {
    
    var a = 10;
    while(a < 20){
      println(a)
      a = a+1;
    }
    
    var b = 10
    
    do {
      println(b)
      b = b+1;
    }while(b > 20)
  }
}