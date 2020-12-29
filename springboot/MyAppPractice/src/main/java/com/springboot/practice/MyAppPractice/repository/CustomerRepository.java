package com.springboot.practice.MyAppPractice.repository;

import com.springboot.practice.MyAppPractice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by ANEK on Saturday 5/9/2020 at 5:53 PM
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    
  /*  @Query("select c.cust_id ,c.cust_address,c.actv_flg from Customer c ")
    List<Customer> findByCust_id();*/
}
