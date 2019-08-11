package com.spring.part2.CollectionTypesInjection.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class InjectingCollectionsEx {
    public static void main(String... arg){
        System.out.println("Hi there, Collection Injecting ");

        ApplicationContext context = new ClassPathXmlApplicationContext("part-2/applicationContext.xml");
        Customer customer = (Customer) context.getBean("cust");
        System.out.println(customer);

    }

}
