package com.springboot.practice.MyAppPractice.repository;

import com.springboot.practice.MyAppPractice.model.CustomerExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by ANEK on Saturday 5/9/2020 at 3:22 PM
 */

@Repository
public interface CustomerRepository extends JpaRepository<CustomerExpense,Long> {
}
