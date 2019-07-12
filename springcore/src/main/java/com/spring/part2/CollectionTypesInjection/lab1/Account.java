package com.spring.part2.CollectionTypesInjection.lab1;

class Account{
    private int accNo;
    private String accType;
    private double balance;

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}