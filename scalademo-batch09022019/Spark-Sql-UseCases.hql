USECASE:User Defined Functions

spark2-shell --master local[*] --deploy-mode client
val tempFile = "file:///mnt/home/edureka_144865/temperatures.json" # Change
val tDF = spark.read.json(tempFile)

val convertCelcius = (temp:Double) => (temp*9.0/5.0)+32

spark.udf.register("CTTC",convertCelcius)

 tDF.createOrReplaceTempView("temparature")

 spark.sql("select CTTC(avgHigh),CTTC(avgLow),city from temparature").show()
 
 
 val hdfsPFile = "hdfs:/user/edureka_144865/people.json" # Change
 
 val pDF = spark.read.json(hdfsPFile)
 
 val upperFn = (str:String)=>str.toUpperCase
 
 spark.udf.register("UPPER",upperFn)
 
 pDF.createOrReplaceTempView("people")
 
 spark.sql("select UPPER(name) from people").show
 
 
 USECASE: Interoparating with RDD
 
 val empFile = "hdfs:/user/edureka_144865/employee.txt" ## CHANGE
 
 val empRDD = spark.sparkContext.textFile(empFile)
 
 case class Employee(name:String, age:Int)
 
 val empDF = empRDD.map(iLine => Employee(iLine.split(",")(0),iLine.split(",")(1).toInt))
 
 val empDF = empRDD.map(iLine => Employee(iLine.split(",")(0),iLine.split(",")(1).toInt)).toDF
 
 empDF.createOrReplaceTempView("employee")
 
 spark.sql("select name,age from employee").show
 
 
 PRAGRAMATIC SCHEMA
 
 val schemaStr="name age"
 val tokens = schemaStr.split(" ")
 
 
 import org.apache.spark.sql.types._;
 
 val fields = tokens.map(e => StructField(e,StringType,nullable=true))
 
 val schema = StructType(fields)
 
 import org.apache.spark.sql._;
 
 val rowRDD = empRDD.map(iLine => Row(iLine.split(",")(0),iLine.split(",")(1)))
 
 
 val empDF = spark.createDataFrame(rowRDD,schema)
 
  empDF.createOrReplaceTempView("employee")
 
 spark.sql("select name,age from employee").show
 
 READING PARQUET FILE
 
 val parFile = "hdfs:/user/edureka_144865/users.parquet"
 val uPDF = spark.read.parquet(parFile)
 uPDF.show
 
 SPARK-HIVE Integration
 
 import org.apache.spark.sql._;
 
 case class Elp(name:String, age:Int,address:String)
 
 val e1 = Elp("name1",21,"Address1") 
 val e2 = Elp("name2",22,"Address2") 
 val e3 = Elp("name3",23,"Address3") 
 val e4 = Elp("name4",24,"Address4") 
 val e5 = Elp("name5",25,"Address5") 
 
 val elps = Seq(e1,e2,e3,e4,e5);
 
 val df = elps.toDF
 
 df.select("name","age","address").write.mode(SaveMode.Append).format("parquet").save("hdfs:/user/edureka_144865/Spark-Hive/Elp.parquet")
 
 ## HIVE CREATE TABLE
 
 CREATE EXTERNAL TABLE BATCH09222019ELP(name STRING, age INT, address STRING)
STORED AS PARQUET
LOCATION 'hdfs:/user/edureka_144865/Spark-Hive/Elp.parquet';
 