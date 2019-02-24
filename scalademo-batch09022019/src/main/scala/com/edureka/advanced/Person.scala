package com.edureka.advanced

class Person(name:String,age:Int) {
  
  println(s"$name --> $age")
  
  def printage() {
    println(s"$age")
  }
  var _loc="";
  def this(name:String,age:Int, loc:String){
    this(name,age)
    this._loc=loc;
  }
}