package com.edureka.advanced

case class Student(id:Int,name:String) {
  
  def m1() {
    println(s"$id --> $name")
  }
}