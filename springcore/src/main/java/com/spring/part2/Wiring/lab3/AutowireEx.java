package com.spring.part2.Wiring.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireEx{

    public static void main(String... args){

        System.out.println("Starting the Spring Container");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Shipment shipment = (Shipment) context.getBean("shipment");
        System.out.println(shipment);

    }

}
