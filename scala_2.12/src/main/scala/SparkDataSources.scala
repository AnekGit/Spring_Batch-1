import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
  * created by ANEK on Saturday 8/31/2019 at 1:42 PM 
  */

object SparkDataSources {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("SparkDataSource")
                                                    .set("spark.driver.allowMultipleContexts", "false")

    val spark = SparkSession.builder().config(conf).getOrCreate()


    val dfTags = spark
      .read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv("F:\\JavaProjects\\SpringTutorial\\scala_2.12\\src\\main\\resources\\questions_tags_10K.csv")
      .toDF("Id","Tag")

             dfTags.show(5)

  }


}
