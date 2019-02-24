package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object HelloSpark {
  
  def main(args: Array[String]): Unit = {
    
    //Create SparkConf
    val sparkConf  = new SparkConf()
    
    sparkConf.setAppName("Helloworld Spark");
    sparkConf.setMaster("local[*]")
    
    val sc = new SparkContext(sparkConf);
    
    val input = List("DEER","RIVER","RIVER")
    val inputRDD = sc.parallelize(input, 2);
    inputRDD.count();
  }
  
}