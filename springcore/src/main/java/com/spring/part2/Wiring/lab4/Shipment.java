package com.spring.part2.Wiring.lab4;

public class Shipment {

    private Consignment consignment;
    private Carrier carrier;

    public Shipment(){
        System.out.println("Shipment : default constructor ...");
    }
    public Consignment getConsignment() {
        return consignment;
    }

    public void setConsignment(Consignment consignment) {
        System.out.println("Consignment setter of Shipment");
        this.consignment = consignment;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        System.out.println("carrier setter of Shipment");
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "consignment=" + consignment +
                ", carrier=" + carrier +
                '}';
    }
}
