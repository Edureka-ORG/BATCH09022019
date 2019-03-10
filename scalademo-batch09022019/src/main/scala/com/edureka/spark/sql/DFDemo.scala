package com.edureka.spark.sql

import org.apache.spark.sql.SparkSession

object DFDemo {
  def main(args: Array[String]): Unit = {
    
    val spark = SparkSession.builder().appName("DFDemo").master("local[*]").getOrCreate();
    
    val peopleJson = "file:///Users/sa356713/git/BATCH09022019/scalademo-batch09022019/src/main/resources/people.json";
    
    val pdf = spark.read.json(peopleJson);
    
    pdf.show()
    pdf.printSchema();
    val pnameDF = pdf.select("name")
    pnameDF.show()
    
    import spark.implicits._;
    
    val ageDF = pdf.select($"name",$"age"+1);
    ageDF.show();
    
    
  }
}