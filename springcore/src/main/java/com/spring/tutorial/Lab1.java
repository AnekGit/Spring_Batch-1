package com.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Lab1 {

    public static void main(String... arg){

        System.out.println("Staring Spring Container ");

        //creates spring container 
        ApplicationContext context = new AnnotationConfigApplicationContext(Lab1Configuration.class);
        //ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = (A) context.getBean("aBean");
        System.out.println(a);
        Hello h = (Hello)context.getBean("hello11111111");
        h.showHello();
        
    }
}
