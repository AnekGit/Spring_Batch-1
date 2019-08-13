package com.all_about_scala.chapter2.escape

object Test {

  def main(args :Array[String]):Unit = {

    // escaping JSON Strings
    val donutJson: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"

    println(donutJson)

    // USE THIS : using "\"\"  triple quotes  : if you have to escape long JSON use this

    val trippleString : String ="""{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""

    print(trippleString)

    val  strip =
      """
        |{
        |"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50
        |}
        | """.stripMargin

         println(strip)





  }


}
