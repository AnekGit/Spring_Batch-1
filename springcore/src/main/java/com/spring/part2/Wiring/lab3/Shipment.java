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

        System.out.println("shipment : csm setter");
        this.consignment = consignment;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier)
    {
        System.out.println("shipment : carrier setter");
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
