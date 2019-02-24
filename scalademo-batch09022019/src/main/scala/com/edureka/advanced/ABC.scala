package com.edureka.advanced

trait ABC {
  def isEqual(x:Any):Boolean;
  def isNotEqual(x:Any):Boolean = !isEqual(x);
}