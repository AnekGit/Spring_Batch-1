package com.all_about_scala.chapter2.forloop

/**
  * created by ANEK on Tuesday 8/13/2019 at 11:06 PM 
  */

object forloop {

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4,55,6,6,77,88,90)

    // for statement
     for (element <- list){
      // println(s" element is $element")
     }

    //filtering in for loop
     for (e <- list
          if e > 10 ){
       println(s" filtered element is $e")
     }

    val result = for{
                     e <- list
                     if e >10
                    } yield e
   println(s" resultant is $result")


  }

}
