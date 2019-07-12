package com.spring.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Lab1Configuration {

    @Bean("aBean" )
    public A createA(){
        A aobj = new A();

        return aobj;
    }

    @Bean("helloBean")
    public Hello hello(A aobj){
        Hello hello = new Hello(aobj);
        return hello;

    }
}
