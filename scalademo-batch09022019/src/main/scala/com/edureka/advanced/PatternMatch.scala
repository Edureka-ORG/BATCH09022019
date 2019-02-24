package com.edureka.advanced

object PatternMatch {
  
  def matchTest(x:Any):Any = x match {
    case 1 => "one"
    case "two" => 2
    case y:Int => scala.Int
    case s:Student => s.toString()
    case _ => "other"
  }
  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTest("two"))
    println(matchTest(22))
    println(matchTest(Student(1,"aaa")))
    println(matchTest(2.5))
  }
}