package com.all_about_scala.chapter2.type_inference

/**
  * created by ANEK on Tuesday 8/13/2019 at 10:48 PM 
  */

object TypeInfer {

  def main(args: Array[String]): Unit = {

   lazy val re =  if (1 == 1)      {
      println("yes")
      println("no")     }
    else
    print("else")

  }

}
