package com.edureka.advanced

object Test {
  def main(args: Array[String]): Unit = {
    val chaitu = new Employee();
    chaitu.name="Chaitu"
    chaitu.printName();
    val santh = new Employee();
    chaitu.org_=("EDUREKA");
    println(chaitu.org)
    chaitu.sal_=(1000)
    chaitu.sal *= 10
    chaitu.sal -= 10
    chaitu.sal += 10
    chaitu.sal %= 10
    
    Account.m2();
    val acc = new Account();
    acc.m1
    
     val v = new Vehicle(10);
    println(v.mph);
    v.race();
    val c = new car(20)
    println(c.mph);
    c.race();
    
    
  }
}