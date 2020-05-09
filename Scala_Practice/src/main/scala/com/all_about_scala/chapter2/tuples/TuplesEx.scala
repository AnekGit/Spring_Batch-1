package com.all_about_scala.chapter2.tuples

/**
  * created by ANEK on Thursday 8/15/2019 at 2:39 PM 
  */

object TuplesEx {

  def main(args: Array[String]): Unit = {

    val tuple2 = Tuple2( ( 10,"emp-1") , (11,"emp-2"))
    println(s"tuple1 is : ${tuple2._2}")

    case class Emp(id :Int ,name :String)

    // be careful while using Tuple1 , it treates all the element stores as single tuple
    val tup_emp = Tuple1(Emp(1,"E1"),Emp(2,"E2"),Emp(3,"E3"))

    //note output
    println(tup_emp)
    println(tup_emp._1)

    val t1 = (1,"A1")
    val t2 = Tuple2(2,"A2")
    val t3 = Tuple2(3,"A3")

    val list_tuples  = List(t1,t2,t3)

    for(t <- list_tuples){

      //println(t)
     t match {

       case (1,_) => println(s"Hey ${t._2}")
       case s @ _ => println(s"default value is ${s._1} ")    // NOTE : s @ _ is for capturing default value provided

      } //match


    }    //

    println("#################################")
    val arr = Array(0,1,2,3)
    println(arr)











    val emp = Emp(1,"emp-1")
   // println(emp.name)




  }

}

