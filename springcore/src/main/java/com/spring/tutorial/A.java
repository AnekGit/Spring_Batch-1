package com.spring.tutorial;

public class A {
            int i =10;
            String h ="i am in A";


    public A() {
        System.out.println("called ");
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", h='" + h + '\'' +
                '}';
    }
}
