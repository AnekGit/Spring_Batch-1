package com.spring.part2.Wiring.lab3;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {


    @Bean("consignment")
    public Consignment consignment(){
          Consignment csm = new Consignment();
                      csm.setCsmName("IKEA Furniture");
                      csm.setCsmNo(110);


        return csm;
    }
    @Bean("carrier1")
    public Carrier carrier1(){
        return new Carrier(101,"DHL");
    }

    @Bean(name="shipment",autowire = Autowire.BY_NAME)
    public Shipment shipment(){

        return  new Shipment();
    }

}
