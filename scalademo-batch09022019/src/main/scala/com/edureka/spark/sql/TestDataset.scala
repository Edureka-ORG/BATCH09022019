package com.edureka.spark.sql

import org.apache.spark.sql.SparkSession

object TestDataset {
  def main(args: Array[String]): Unit = {
    
    val spark = SparkSession.builder().appName("DFDemo").master("local[*]").getOrCreate();

    val e1  = Employee("AAA",111)
    val e2  = Employee("BBB",222)
    val e3  = Employee("AAA",111)
    val e4  = Employee("CCC",333)
    
    val employees = Seq(e1,e2,e3,e4)
    
    import spark.implicits._;
    
    val eDF = employees.toDS();
    
    
    
  }
}