package com.edureka.advanced

object TestHO {
  
  
  //sumInts 1 to 5 --> 1+2+3+4+5
  def sumInts(i:Int, j:Int):Int = {
    if(i > j) return 0 else i+sumInts(i+1,j)
  }
  
  
  //sumSqrInts 1 to 5 --> 1*1+2*2+3*3+4*4+5*5 1+4+9+16+25
  
   def sumSqrInts(i:Int, j:Int):Int = {
    if(i > j) return 0 else i*i+sumSqrInts(i+1,j)
  }
   
  def sums(i:Int,j:Int, f:Int => Int):Int= {
    if(i > j) return 0 else f(i) + sums(i+1,j,f)
  }
  
  def HO(i:Int) = {
    (x:Int) => x*i;
  }
  
  def main(args: Array[String]): Unit = {
    println(sumInts(1, 5))
    println(sumSqrInts(1, 5))
    
    val sumIntFn = (x:Int)=>x;
    val sumSqrFn = (x:Int)=>x*x;
    val sumQubesFn = (x:Int)=>x*x*x;
    
    println(sums(1,5,(x:Int)=>x))
    println(sums(1,5,sumIntFn))
    
    
    println(sums(1,5,sumQubesFn))
    
    var fn = HO(5)
    println(fn(3))
    
    
  }
}