import org.apache.spark.SparkConf
import org.apache.spark.sql.{Dataset, Encoder, SparkSession, types}
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.{StructField, _}

/**
  * created by ANEK on Saturday 8/31/2019 at 1:42 PM 
  */

object SparkDataSources {

  val conf = new SparkConf().setMaster("local[*]").setAppName("SparkDataSource")
    .set("spark.driver.allowMultipleContexts", "false")

  val spark = SparkSession.builder().config(conf).getOrCreate()

  case class CsvVo(id : Int ,tag : String)

  def main(args: Array[String]): Unit = {

    import spark.implicits._

    val schema = StructType(
      Array(
          StructField("Id", IntegerType ,true),
          StructField("Tag", StringType, true)
      )

    )

    val dfTags = spark
      .read
      .schema(schema)
      //.option("header", "true")
      //.option("inferSchema", "true")
      .csv("F:\\JavaProjects\\SpringTutorial\\scala_2.12\\src\\main\\resources\\questions_tags_10K.csv")
      .as[CsvVo]

    //.toDF("Id","Tag")

    dfTags.map(e => e.tag).show(5)
    dfTags.withColumn("Tag_New",col("Tag"))
          .drop("id","Tag")
          .show(5)

   // readFromCSV("F:\\JavaProjects\\SpringTutorial\\scala_2.12\\src\\main\\resources\\questions_tags_10K.csv")



  }
 /* def readFromCSV[T : Encoder[T]](path :String ):Dataset[T]={

         spark.read
           .option("header","true")
           .option("inferSchema","true")
           .csv(path)
           .as[CsvVo]


  }
*/


}
