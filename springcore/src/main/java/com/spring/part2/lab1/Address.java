package com.spring.part2.lab1;

class Address {

    String city;
    String state;

    public Address() {
        System.out.println("default contructor of Address class ");
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}