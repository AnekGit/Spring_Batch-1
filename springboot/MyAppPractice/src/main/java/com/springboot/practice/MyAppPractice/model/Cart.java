package com.springboot.practice.MyAppPractice.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * created by ANEK on Sunday 5/10/2020 at 1:05 PM
 */
@Embeddable
public class Cart implements Serializable {

    @Column(name = "item_name")
    private String itemName ;

    @Column(name = "item_price")
    private float itemPrice ;

    public Cart(){}

    public Cart(String itemName, float itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }
}
