package com.edureka.advanced

class Account {
  def m1() {
    println("Create object to invoke m1")
  }
}

object Account {
  def m2() {
    println("Not required object to invoke m2")
  }
}