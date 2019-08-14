package com.all_about_scala.chapter2.forloop

/**
  * created by ANEK on Tuesday 8/13/2019 at 11:06 PM 
  */

object forloop {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 55, 6, 6, 77, 88, 90)

    // for statement
    for (element <- list) {
      // println(s" element is $element")
    }

    //filtering in for loop
    for (e <- list
         if e > 10) {
      println(s" filtered element is $e")
    }

    val result = for {
      e <- list
      if e > 10
    } yield e
    println(s" resultant is $result")

    // 2 for loops

    for {i <- 1 to 4
         j <- 1 to 3
    }
      println(s"i is $i and corresponding j is $j")

 val twoDim = Array.ofDim[String](2,2)

  twoDim(0)(0) = "anek"
  twoDim(0)(1) = "neha"
  twoDim(1)(0) = "vicky"
  twoDim(1)(1) = "singh"

  for(
    i <- 0 until 2  ;
    j <- 0 until 2)
    println(s" two dim ${ twoDim(i)(j) }  ")

  }
}