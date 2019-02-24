package com.edureka.advanced

trait TABC {
  def isEqual(x:Any):Boolean;
  def isNonEqual(x:Any):Boolean = !isEqual(x);
}