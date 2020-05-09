import org.apache.spark._
import org.apache.spark.sql.types._
import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.functions.col

/**
  * created by ANEK on Friday 8/23/2019 at 11:29 PM 
  */

object SparkEx {

  def main(args: Array[String]): Unit = {

    val config : SparkConf  = new SparkConf()
      .setMaster("local[*]")
      .setAppName("SparkApp")
      .set("spark.driver.allowMultipleContexts", "false")

    val spark = SparkSession.builder().config(config).getOrCreate()

    val seq  = Seq (
      (1,"SMITH","clerk","17-DEC-80",800,20),
      (2,"ALLEN","SALESMAN","20-FEB-86",800,20),
      (3,"SMITH","SALESMAN","22-FEB-82",800,10),
      (4,"JONES","MANAGER","02-APR-81",800,30)
                   )
    println(seq)

    // this import is MUST
    import spark.implicits._
    seq.toDF("id","emp_name","job","hire_date","sal","dept").printSchema()



    val rdd = spark.sparkContext.parallelize(seq).map(

      row =>
              Row(row._1.toInt,row._2.toString,row._3.toString,row._4.toString,row._5.toDouble,row._6.toInt

    )

                                                                  )
   rdd.collect()

    println(rdd.count())

    val schema = StructType(

      Array(
        StructField("emp_id",IntegerType,true),
        StructField("emp_name",StringType,true),
        StructField("job_type",StringType,true),
        StructField("hire_Date",StringType,true),
        StructField("salary",DoubleType,true),
        StructField("dept_no",IntegerType,true)
      )

    )   //struct type

    var df = spark.createDataFrame(rdd, schema)

    df.printSchema()
    df.withColumn("emp_id",col("emp_id").cast(IntegerType))
    df.withColumn("emp_name",col("emp_name").cast(StringType))

    df.withColumn("job_type",col("job_type").cast(StringType))

    df.withColumn("hire_Date",col("hire_Date").cast(StringType))

    df.withColumn("salary",col("salary").cast(DoubleType))

    df.withColumn("dept_no",col("dept_no").cast(IntegerType))


    df.explain(true)
    //df.write.parquet("sink_data/emp_stage")



    case class Citizen(name : String ,age : Int, city : String ,count : Int)
    val data = spark.sparkContext.parallelize(
  List(

    Citizen("Foo",41,"US",3),
    Citizen("Foo",39,"UK",1),
    Citizen("Bar",57,"CA",2),
    Citizen("Bar",72,"CA",2),
    Citizen("Baz",22,"US",6),
    Citizen("Baz",36,"US",6)
      )

    )
              data.glom().collect()
    println("printitng count of List<Citizens>"+data.count)

    println("Listing databases ")
    spark.catalog.listDatabases().show()

    println("listing tables ")
    spark.catalog.listTables().show()

    println("listing columns ")
    spark.catalog.listFunctions()

    
      // data.foreach(s"value for citizen is $data.")

    //data.dropDuplicates(Array("x","count")).show()
    



  }


}
