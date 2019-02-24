package com.edureka.advanced

object TestStudent {
  def main(args: Array[String]): Unit = {
    val s = new Student(1,"aaa");
    val s2 = new Student(1,"aaa");
    val s3 = new Student(1,"aaa");
    val s4 = Student.apply(1,"aaa");
     val s5 = Student.apply(1,"bbbb");
    
    println(s == s2)
    println(s == s3)
    println(s2 == s4)
    println(s2 == s5)
  }
}