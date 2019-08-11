package com.spring.part2.Wiring.lab4;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {


    @Bean()
    public Consignment consignment(){
          Consignment csm = new Consignment();
                      csm.setCsmName("IKEA Furniture");
                      csm.setCsmNo(110);


        return csm;
    }
    @Bean("carrier")
    public Carrier carrier(){
        return new Carrier(101,"DHL");
    }

    @Bean(name="shipment",autowire = Autowire.BY_TYPE)
    //@Lazy
    @Scope("prototype")
    public Shipment shipment(){

        return  new Shipment();
    }

}
