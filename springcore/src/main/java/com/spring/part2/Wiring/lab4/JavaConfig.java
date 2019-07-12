package com.spring.part2.Wiring.lab4;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {


    @Bean()
    public Consignment consignment(){
          Consignment csm = new Consignment();
                      csm.setCsmName("IKEA Furniture");
                      csm.setCsmNo(110);


        return csm;
    }
    @Bean()
    public Carrier carrier(){
        return new Carrier(101,"DHL");
    }

    @Bean(name="shipment",autowire = Autowire.BY_TYPE)
    public Shipment shipment(){

        return  new Shipment();
    }

}
