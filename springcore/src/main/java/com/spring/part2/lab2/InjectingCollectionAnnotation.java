package com.spring.part2.lab2;

import com.spring.part2.lab1.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingCollectionAnnotation {

        public static void main(String... arg){
            System.out.println("Hi there, Collection Injecting ");

            ApplicationContext context = new ClassPathXmlApplicationContext("part-2//applicationContext.xml");
            Customer customer = (Customer) context.getBean("cust");
            System.out.println(customer);

        }

    }

