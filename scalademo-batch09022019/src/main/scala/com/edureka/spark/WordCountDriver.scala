package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCountDriver {
  
  def main(args: Array[String]): Unit = {
    //Create spark context
    
    val sparkConf  = new SparkConf()
    
    sparkConf.setAppName("Helloworld Spark");
    sparkConf.setMaster("local[*]")
    
    val sc = new SparkContext(sparkConf);
    
    //Data preparation
    
    val input = List("DEER RIVER RIVER","RIVER RIVER CAT");
    
    //Convert to words (DEER RIVER RIVER)
    
    val tokenFn = (iLine:String) => iLine.split(" ");
    
    val inputRDD = sc.parallelize(input);
    
    val words = inputRDD.flatMap(iLine => iLine.split(" ")) //words
    
    words.countByValue().foreach(println);
    
    
    
  }
  
  
  
}