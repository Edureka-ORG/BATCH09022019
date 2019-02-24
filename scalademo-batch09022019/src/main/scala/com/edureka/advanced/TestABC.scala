package com.edureka.advanced

class TestABC extends ABC with TABC{
  def isEqual(x: Any): Boolean = {
    x.toString().equals("other")
  }
}