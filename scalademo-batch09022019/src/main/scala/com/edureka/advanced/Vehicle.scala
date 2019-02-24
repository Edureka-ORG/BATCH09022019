package com.edureka.advanced

class Vehicle(speed:Int) {
  var mph:Int = speed
  def race() = println("Vehicle Racing");
}

class car(speed:Int) extends Vehicle(speed){
  override def race() = println("car Racing with speed:"+speed);
}

object TestVehicle{
  def main(args: Array[String]): Unit = {
    val v = new Vehicle(10);
    println(v.mph);
    v.race();
    val c = new car(20)
    println(c.mph);
    c.race();
  }
}