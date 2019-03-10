package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object TestDag {
  
  def main(args: Array[String]): Unit = {
    
    //Create SparkConf
    val sparkConf  = new SparkConf()
    
    sparkConf.setAppName("TestDag Spark");
    sparkConf.setMaster("local[*]")
    
    val sc = new SparkContext(sparkConf);
    
    val r00 = sc.parallelize(0 to 9);

    val r01 = sc.parallelize(0 to 90 by 10);
    
    val r10 = r00 cartesian r01
    
    val r11 = r00.map(n => n*n)
    
    val r12 = r00 zip r01
    
    val r13 = r01.keyBy(_/20)
    
    r13.cache();
    
    r13.collect();
    r12.collect()
    
  }
  
}