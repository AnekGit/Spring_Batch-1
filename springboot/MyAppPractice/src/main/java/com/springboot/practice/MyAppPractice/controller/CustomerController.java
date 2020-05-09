package com.springboot.practice.MyAppPractice.controller;

import com.springboot.practice.MyAppPractice.model.CustomerExpense;
import com.springboot.practice.MyAppPractice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * created by ANEK on Saturday 5/9/2020 at 3:39 PM
 */

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository ;
    
    @GetMapping("/getExpense")
    public CustomerExpense getCustomerExpense(){

        Optional<CustomerExpense> expense = customerRepository.findById(1L);

        System.out.println("Customer details "+expense.get());
        return expense.get();

    }
    @GetMapping("/save")
    public String saveCustomer(){

       //customerRepository.save(new CustomerExpense(1L,"Vicky","1200"));
        return "Saved!!!"   ;

    }
}
