package com.spring.part2.Wiring.lab5;

public class Carrier {

    private int carrierCode;
    private String carrierName ;

    public Carrier(int carrierCode, String carrierName) {
        System.out.println("Carrier - arg constructor is called ... ");
        this.carrierCode = carrierCode;
        this.carrierName = carrierName;
    }

    @Override
    public String toString() {
        return "Carrier{" +
                "carrierCode=" + carrierCode +
                ", carrierName='" + carrierName + '\'' +
                '}';
    }
}
