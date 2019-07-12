package com.spring.part2.labs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingCollectionsEx {
    public static void main(String... arg){
        System.out.println("Hi there, Collection Injecting ");

        ApplicationContext context = new ClassPathXmlApplicationContext("part-2//applicationContext.xml");
        Customer customer = (Customer) context.getBean("cust");
        System.out.println(customer);

    }

}
