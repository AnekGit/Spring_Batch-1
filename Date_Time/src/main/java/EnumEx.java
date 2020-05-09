import java.sql.*;
/**
 * created by ANEK on Friday 8/23/2019 at 11:40 AM
 */

public class EnumEx {

    public static  void  main(String... args) throws ClassNotFoundException {

        Class cls = Class.forName("oracle.jdbc.driver.OracleDriver");

        System.out.println(cls.getClass());

        Taste.getTaste(null);
        Apple apple = null;


    }
}


enum Apple {
    JUICE("juice"),SHAKE("shake"),RAW("raw")  ;

    private final  String s ;
    Apple(String s ){
        this.s=s;
    }
}

class Taste {

    public static void  getTaste(final Apple apple){

        System.out.println("Apple type is "+apple);


    }

}