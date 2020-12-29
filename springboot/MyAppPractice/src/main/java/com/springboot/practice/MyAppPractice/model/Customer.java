package com.springboot.practice.MyAppPractice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * created by ANEK on Saturday 5/9/2020 at 4:33 PM
 */

@Entity
@Table(name = "customer")
/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@SequenceGenerator(name = "",sequenceName = "")

    @Column(name = "cust_id")
    private Long cust_id ;

    @Column(name = "cust_address")
    private String cust_address ;

    @Column(name = "actv_flg")
    private String actv_flg ;

    @ElementCollection
    @JoinTable(name="customer_cart",joinColumns = { @JoinColumn(name = "customer_id") })
            /*
            Note : -

            why @JoinTable : -
            =============================================================================
            Since it's a collection table not a separate entity that defines
            @Entity and @Table(name="some_name") on top of that so this annotation comes

            Description : -
            =============================================================================
            Here name is the table name that will be created for this collection
            and joinColumns is an array of primary key columns

            Here collection table has ALREADY mapped the join field from the
            wrapper table

            Here  joinColumn a CUSTOM NAME for collection table of the join field of
            wrapper table


            */


    Collection<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "customer")
    List<CustomerExpense> customerExpenses ;



    public String getActv_flg() {
        return actv_flg;
    }

    public Collection<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Collection<Cart> carts) {
        this.carts = carts;
    }


    //constructor


    public Customer(){}

    public Customer(Long cust_id, String cust_address, String actv_flg, List<CustomerExpense> customerExpenses) {
        this.cust_id = cust_id;
        this.cust_address = cust_address;
        this.actv_flg = actv_flg;
        this.customerExpenses = customerExpenses;
    }

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public String isActv_flg() {
        return actv_flg;
    }

    public void setActv_flg(String actv_flg) {
        this.actv_flg = actv_flg;
    }

    public List<CustomerExpense> getCustomerExpenses() {
        return customerExpenses;
    }

    public void setCustomerExpenses(List<CustomerExpense> customerExpenses) {
        this.customerExpenses = customerExpenses;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", cust_add='" + cust_address + '\'' +
                ", actv_flg='" + actv_flg + '\'' +
                '}';
    }
}
