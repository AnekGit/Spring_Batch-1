package com.programming.practice;


import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * created by ANEK on Friday 9/6/2019 at 11:23 PM
 */

public class IntersectionEx {

    public  static void  main(String... args){

        List<String> list1 = Arrays.asList("a","b","c","d","e");

        List<String> list2 = Arrays.asList("a","b");

        System.out.println("*** intersection ***");
        List<String> intersection = list1.stream().filter(e -> list2.contains(e)).collect(Collectors.toList());

        intersection.forEach(System.out::println);

        //2 .union

        System.out.println("*** Union ***");
        List<String> union = Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());

        union.forEach(System.out::println);

      List<Customer> listOfCust1 = new ArrayList<>(5);
                     listOfCust1.add(new Customer(10,"Neha")) ;
                     listOfCust1.add(new Customer(5,"Vicky")) ;
                     listOfCust1.add(new Customer(3,"Abhishek"));

      List<Customer> listOfCustomer2 = new ArrayList<>(2);
                     listOfCustomer2.add(new Customer(10,"Neha"));
                     listOfCustomer2.add(new Customer(5,"Vicky"));

        System.out.println(" ************  Intersection of the customers  ************");
      List<Customer> custIntersection=
             listOfCust1.stream().filter(e->listOfCustomer2.contains(e)).collect(Collectors.toList());

        custIntersection.forEach(System.out::println);

        custIntersection.sort(Comparator.comparing(Customer::getCust_id));

        System.out.println(comp.apply(new Customer(10,"Neha"),new Customer(22,"Neha"))) ;


        System.out.println("***********   After Sorting **************");
        custIntersection.forEach(System.out::println);
    }
    static BiFunction<Customer,Customer,Integer> comp = (o1,o2) -> (int)o1.cust_id-o2.cust_id ;
}

class Customer implements Comparable<Customer>{
    int cust_id ;
    String cust_name ;
    Customer(int cust_id ,String cust_name){


        this.cust_id = cust_id ;
        this.cust_name = cust_name ;
    }

    public int getCust_id() {
        return cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return cust_id == customer.cust_id &&
                Objects.equals(cust_name, customer.cust_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cust_id, cust_name);
    }

    public int compareTo(Customer customer){

        return   this.cust_id - customer.cust_id;

    }
    public String toString(){
        return "[ "+this.getClass().getSimpleName()+" : - cust_id :- "+cust_id+" cust_name :-"+cust_name +" ]";
    }
}