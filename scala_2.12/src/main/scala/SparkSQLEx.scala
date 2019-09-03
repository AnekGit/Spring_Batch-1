import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
  * created by ANEK on Tuesday 9/3/2019 at 1:04 PM 
  */

object SparkSQLEx{

def main(args: Array[String]): Unit = {

  val conf : SparkConf = new SparkConf().setMaster("local[*]").setAppName("SparkSQLEx")

  val spark = SparkSession.builder().config(conf).getOrCreate()

  val rdd1 = spark.sparkContext.parallelize(List("tiger","lion","peacock","horse","tiger"))

  val rdd2 = spark.sparkContext.parallelize(List("tiger","lion"))

  // 1. union : unlike mathematical operation ,it does not remove duplicates
  println("=======================union================================================")
  rdd1.union(rdd2).distinct().collect().map(e => e.mkString("")).foreach(println)

  println("=========================rdd1 ==========================================")
  rdd1.collect().foreach(println)


  
  /*2. intersection :
     A .gives common elements and removes duplicate
     B. involves shuffling has worst performance

   */

  println("=============================intersection ==========================================")
 val intersection = rdd1.intersection(rdd2).collect()
  intersection.foreach(println)




  // 3 subtract : returns only  elements that are present in firstRDD

  println("subtraction ==========")
  rdd1.subtract(rdd2).collect().foreach(println)


  // 4 . distinct: involves shuffling of data

  println("distinct==============")
  rdd1.distinct().collect().foreach(println)




}

}
