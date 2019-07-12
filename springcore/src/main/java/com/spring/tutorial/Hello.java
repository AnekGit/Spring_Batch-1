package com.spring.tutorial;


public class Hello {

    A a ;
    public Hello (A aobj){
        System.out.println("constructor is called ");
         this.a=aobj;
    }

    public void showHello(){
        System.out.println("A is "+a.i);
    }
}
