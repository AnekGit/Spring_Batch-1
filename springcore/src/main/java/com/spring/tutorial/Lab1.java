package com.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Lab1 {

    public static void main(String... arg){

        System.out.println("Hey there ");

        //creates spring container 
        ApplicationContext context = new AnnotationConfigApplicationContext(Lab1Configuration.class);
       //  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = (A) context.getBean("aBean");
        System.out.println(a);
        Hello h = (Hello)context.getBean("helloBean");
        h.showHello();
        
    }
}
