package com.springboot.practice.MyAppPractice.controller;

import com.springboot.practice.MyAppPractice.model.Customer;
import com.springboot.practice.MyAppPractice.model.CustomerExpense;
import com.springboot.practice.MyAppPractice.repository.CustomerExpenseRepository;
import com.springboot.practice.MyAppPractice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * created by ANEK on Saturday 5/9/2020 at 3:39 PM
 */

@RestController
public class CustomerController {

    @Autowired
    CustomerExpenseRepository customerExpenseRepository ;

    @Autowired
    CustomerRepository customerRepository ;

    @GetMapping("/getExpense")
    public CustomerExpense getCustomerExpense(){

        Optional<CustomerExpense> expense = customerExpenseRepository.findById(1L);

        System.out.println("Customer details "+expense.get());
        return expense.get();

    }
    @GetMapping("/save")
    public String saveCustomer(){

       List<Customer> customers = customerRepository.findAll();

       Customer customer = customerRepository.findById(101L).get();

       CustomerExpense expense = new CustomerExpense();
       
       expense.setCustName("Mark Hammer");
       expense.setAmount("10000");

       expense.setCustomer(customer);

       customerExpenseRepository.save(expense);

        System.out.println("**********   Getting ************");
        customer.getCustomerExpenses().forEach(System.out::println);

        System.out.println();
        System.out.println("Here is the customer :: "+customers.get(0));



       //customerRepository.save(new CustomerExpense(1L,"Vicky","1200"));
        return "got !!!"   ;

    }
}
