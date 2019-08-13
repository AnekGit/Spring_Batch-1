package com.all_about_scala.chapter2.stringinterpolation.Test

object Test {

  def main(args : Array[String]) :Unit = {

    // 2. printing  object properties

    case class Employee(name : String ,age : Int )

    val employee:Employee = Employee("Anek",29)

    println(s"Emp details : - ${employee.name} , ${employee.age}")

    // 3. formatting Numbers

    val amount :Float = 29

    println(f"amount is : $amount%.2f ")

    //  4. formatting text

    val txt :String = "formatting text example"

    println(f"$txt%50s")

    // 5. evaluating  expression

    val exp = 10

    println(s"comparing := ${exp == 10}")

    // 6. raw interpolation : prints any symbol inside string

    println(raw"$txt \t \n \u0004 $txt")

  }


}
