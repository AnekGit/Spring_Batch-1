package com.springboot.practice.MyAppPractice;

import java.io.*;
import java.util.Properties;

/**
 * created by ANEK on Tuesday 12/29/2020 at 8:46 PM
 */

public class PropertyLoader {
    private static boolean toLoad = true;
    public static void main(String... args) throws IOException {

        while(toLoad) {
            propertyload();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void propertyload(){

        Thread thread = new Thread(

                () -> {
                    java.util.Properties properties = new Properties();

                    try(FileInputStream fis = new FileInputStream("F:\\JavaProjects\\SpringTutorial\\springboot\\MyAppPractice\\src" +
                            "\\main\\resources\\application.properties")) {
                        properties.load(fis);

                /*
                            NOTE :
                             1. use / only
                             2. if change the property in application.properties file ,
                                changes will not be reflected after thread picks up your .properties file


                properties.load(
                PropertyLoader.class.getClass().getResourceAsStream("/application.properties"));

              */          System.out.println("thread Name "+Thread.currentThread().getName()+
                                "spring.profiles.active : "+ properties.getProperty("spring.profiles" +
                                ".active"));

                    } catch (Exception e) {
                        System.out.println("Could not load the properties");
                        toLoad =false;
                        e.printStackTrace();
                    }


                },"Anek -Thread");
         thread.start();

    }


}
