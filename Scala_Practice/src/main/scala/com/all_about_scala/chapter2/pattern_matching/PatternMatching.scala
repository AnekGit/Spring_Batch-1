package com.all_about_scala.chapter2.pattern_matching

/**
  * created by ANEK on Thursday 8/15/2019 at 12:44 PM 
  */

object PatternMatching {

  def main(args : Array[String]): Unit = {

    val emp_name = "ANEK"

    lazy val matcing = emp_name match {
      case "ANEK" => println("Name is present ")

      case _ => println("No such name ")

    }
    println(matcing)
    // println(s"matching variable :  - ${matcing}")


    var emp_dept = "EC,Mech"
   // var emp_dept1 = Array("EC","Mech")

    emp_dept match {

      case s  if(s.split(",")(1) == "Mech") => println("Only Mech")

      case "EC" | "Mech" => println("EC or Mech")

      case _ => println("default")

    }

    // case class match

    case class Student(id :Int ,name :String ,add :String)

    val st1 = Student(1,"Anek","Basant Vihar")
    val st2 = Student(2,"Ganga","himalaya")

    val st_list:List[Student] = List(st1,st2)

    //st_list.foreach(println)

    for (st <- st_list){

      st match {


        case s if s.hashCode().equals(st1.hashCode()) => println(s" name is : - ${st1.name}")
        case s if s.hashCode().equals(st2.hashCode()) => println(s" name is : - ${s.name}")


    /*  case st1 => println(s" Hey : ${st1.name} ,your addr is : ${st1.add}}")
        case st2 => println("Hey Ganga")

    */
        case _ => println("default ")

      }//match

    }



















  }



}
