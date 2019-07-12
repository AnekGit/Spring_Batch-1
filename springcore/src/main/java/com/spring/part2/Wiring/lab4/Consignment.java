package com.spring.part2.Wiring.lab4;

public class Consignment {

    private long csmNo;
    private String csmName;

    public Consignment(){
        System.out.println("Consignment : default constructor is called ...");
    }
    public long getCsmNo() {
        return csmNo;
    }

    public void setCsmNo(long csmNo) {
        this.csmNo = csmNo;
    }

    public String getCsmName() {
        return csmName;
    }

    public void setCsmName(String csmName) {
        this.csmName = csmName;
    }

    @Override
    public String toString() {
        return "Consignment{" +
                "csmNo=" + csmNo +
                ", csmName='" + csmName + '\'' +
                '}';
    }
}
