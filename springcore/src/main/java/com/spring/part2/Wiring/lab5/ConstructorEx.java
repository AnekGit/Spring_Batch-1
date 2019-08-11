package com.spring.part2.Wiring.lab5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorEx {

    public static void main(String... args){


        ApplicationContext context = new ClassPathXmlApplicationContext("part-2/consApplicationContext.xml");


        Shipment ship =(Shipment)context.getBean("shipment");
        System.out.println(ship);


    }




}

