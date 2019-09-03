/**
 * created by ANEK on Friday 8/23/2019 at 11:40 AM
 */

public class EnumEx {

    public static  void  main(String... args){

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