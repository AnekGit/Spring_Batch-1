package com.springboot.practice.MyAppPractice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

/**
 * created by ANEK on Saturday 5/9/2020 at 3:07 PM
 */

@Entity
@Table(name = "cust_exp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerExpense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    //@SequenceGenerator(name = "cust_expense_seq",sequenceName = "cust_expense_seq")
    @Column(name = "cid")
    private Long custId ;


   /* public CustomerExpense(Long custId, String custName, String amount) {
        this.custId = custId;
        this.custName = custName;
        this.amount = amount;
    }

    public CustomerExpense() {

    }*/

    @Column(name ="cname")
    private String custName ;

    @Column(name ="amount")
    private String amount ;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_cust_id",referencedColumnName = "cust_id")
    private Customer customer;




    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }



    @Override
    public String toString() {
        return "CustomerExpense{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
