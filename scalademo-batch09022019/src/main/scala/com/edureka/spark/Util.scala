package com.edureka.spark

object Util {
  def split(iLine:String, sep:String):Array[String] = {
    iLine.split(sep);
  }
}