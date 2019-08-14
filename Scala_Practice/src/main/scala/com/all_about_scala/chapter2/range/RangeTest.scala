package com.all_about_scala.chapter2.range

/**
  * created by ANEK on Wednesday 8/14/2019 at 11:27 AM 
  */

object RangeTest {

  def main(args: Array[String]): Unit = {

    var range1 = 1 to 10
    println(s"range is : $range1")

    var rangeTo = 1 to 10 by 2
    //println(rangeTo.step)
    println(s"rangeTo is : $rangeTo")

    var charRange = 'a' to 'z'
    println(s"charRange is : $charRange ")

    lazy val  rangePrint = for {i <- range1 if i%2==0} yield println(s"range values $i")

    lazy val charrange1 = for {i <- charRange if i.equals('a')} yield println(s" char $i")

    lazy val iftest = if(range1.step == 2) println("two") else println("not 2")
    println("after lazy operation ")

    // print(rangePrint)

    // from range to seq

    val seq1 = (1 to 10).toSeq
    println(seq1.mkString(" "))

    val list1 = (1 to 10).toList
    println(list1.mkString(" "))

    val set1 = (1 to 10).toSet
    println(set1.mkString(" "))

    
   
    





  }

}
