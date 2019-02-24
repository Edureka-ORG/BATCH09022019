package com.edureka.basic

object ForEachDemo {
  def main(args: Array[String]): Unit = {
    var s = "Helloworld";
    
    s.foreach(println);
    
    var l = List(1,2,3)
    l.foreach(println)
    
    
    var r = 1 to 10;
    
    for(i <- r) {
      println(i)
    }
    
    var s1 = "Helloworld";
    var len = s1.length();
    
    for ( i <- 0 until len) {
      println(s1(i))
    }
    
    for ( i <- 0 to 3; j <- 0 to 4) {
//      println(i+"-->"+j)
      println(s"$i --> $j");
    }
    
      for ( i <- 0 to 3; j <- 0 to 4; if(i==j); x = j-2) {
//      println(i+"-->"+j)
      println(s"$i --> $j -->$x");
    }
      
      var x = for(i <- 0 to 3) yield i*2.5
      x.foreach(println);
    
  }
}