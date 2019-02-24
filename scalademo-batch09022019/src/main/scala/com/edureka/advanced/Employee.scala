package com.edureka.advanced

class Employee {
  
  //attributes
  var id = -1;
  var name = ""
  var salary = 0f
  //methods
  
  def printName(){
    println(this.name)
  }
  
  private var _org = "";
  
  def org() = _org;
  
  def org_=(org:String) {
    if(org == "Edureka")
    {
      this._sal=10000;
    }
    this._org=org;
  }
  
  private var _sal = 0;
  
  def sal = {
    println("In getter")
    _sal;
  }
  def sal_=(sal:Int){
    println("In setter")
    this._sal=sal;
  }
  
}