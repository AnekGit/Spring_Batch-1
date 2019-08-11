package com.spring.part2.Wiring.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireEx{

    public static void main(String... args){

        System.out.println("Starting the Spring Container");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Shipment shipment = (Shipment) context.getBean("shipment");
        /*Carrier car = (Carrier)context.getBean("carrier");
        System.out.println("carrier is :"+car);
        */System.out.println(shipment);

    }

}
