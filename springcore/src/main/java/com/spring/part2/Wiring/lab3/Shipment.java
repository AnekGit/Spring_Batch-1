package com.spring.part2.Wiring.lab3;

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
        this.consignment = consignment;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
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
