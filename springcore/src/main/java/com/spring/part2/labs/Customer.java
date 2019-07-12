package com.spring.part2.labs;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {

    private int cid;
    private String cname;
    private String email ;
    private long phone;
    private List<String> emails;
    private Set<Long> phones ;
    private Map<String,String> refs;
    private Properties properties;
    private Address address;
    private List<Account> accounts;

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", emails=" + emails +
                ", phones=" + phones +
                ", refs=" + refs +
                ", properties=" + properties +
                ", address=" + address +
                ", accounts=" + accounts +
                '}';
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public Set<Long> getPhones() {
        return phones;
    }

    public void setPhones(Set<Long> phones) {
        this.phones = phones;
    }

    public Map<String, String> getRefs() {
        return refs;
    }

    public void setRefs(Map<String, String> refs) {
        this.refs = refs;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Customer(int cid, String cname, String email, long phone) {
        this.cid = cid;
        this.cname = cname;
        this.email = email;
        this.phone = phone;
    }

}


