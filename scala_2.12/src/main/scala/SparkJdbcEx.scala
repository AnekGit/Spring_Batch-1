import java.time.LocalDate
import java.time.format.DateTimeFormatter

import org.apache.arrow.vector.types.pojo.ArrowType.Timestamp
import org.apache.spark.sql.functions.lit
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.functions.current_timestamp
import org.apache.spark.sql.types.{DateType, IntegerType, TimestampType}
/**
  * created by ANEK on Saturday 8/31/2019 at 2:06 PM 
  */

object SparkJdbcEx {                                                                            7

  def main(args: Array[String]): Unit = {


    val conf = new SparkConf().setMaster("local[*]").setAppName("SparkJdbc").set("spark.driver.allowMultipleContexts", "false")

    val spark = SparkSession.builder().config(conf).getOrCreate()

   val cls = Class.forName("oracle.jdbc.driver.OracleDriver").newInstance()

    print(cls.getClass)

    var empDF = spark.read
      .format("jdbc")
      .option("url", "jdbc:oracle:thin:@localhost:1521/AnekDB")
      .option("dbtable", "emp_table")
      .option("user", "SYSTEM")
      .option("password", "VIckyDB")
      .option("driver", "oracle.jdbc.driver.OracleDriver")
      .load()

    LocalDate.now()
    DateTimeFormatter.ofPattern("yyyy-MM-dd")

    empDF = empDF.withColumn("current_date", lit(current_timestamp) )
    empDF.printSchema()
    empDF.show()

    // 1 . groupBY
    empDF.groupBy("deptno").count().show()

    // 2.  average salary department wise
    empDF.groupBy(col("deptno")).agg(avg("sal")).show()

    // 3 summing up the sal column
    empDF.agg(sum("sal")).show()
    //empDF.repartition(3).write.csv("sink_resources/my_csv")

    val emp_stage = spark.read.parquet("sink_data/emp_stage")

    var join1 = empDF.join(emp_stage,col("ename").equalTo(col("emp_name")),"inner")

    empDF.describe("sal").show()

   // join1.show()

    //empDF.join(emp_stage)     .show()


   val ds =  spark.read
         .option("inferSchema","true")
         .option("header","true")
         .option("dateFormat","yyyy")
     .csv("F:\\JavaProjects\\SpringTutorial\\scala_2.12\\src\\main\\resources\\questions_10K.csv")

    ds.printSchema()
    ds.show()

    val ds_questions = ds.select(

      ds.col("Id").cast(IntegerType),
      ds.col("CreationDate").cast(TimestampType).substr(0,10).as("CreationDate"),
      ds.col("ClosedDate").cast(TimestampType),
      ds.col("DeletionDate").cast(DateType),
      ds.col("Score").cast(IntegerType),
      ds.col("OwnerUserId").cast(IntegerType),
      ds.col("AnswerCount").cast(IntegerType)


    )

    ds_questions.printSchema()
                 ds_questions.show()

     



  }

}
