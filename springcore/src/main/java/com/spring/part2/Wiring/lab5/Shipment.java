package com.spring.part2.Wiring.lab5;

public class Shipment {

    private Consignment consignment;
    private Carrier carrier;

    public Shipment(){
        System.out.println("Shipment : default constructor ...");
    }


public Shipment(Consignment csm){
    System.out.println("in arg - csm constructor ");
        this.consignment=csm;
}
    public Shipment(Carrier carrier){
        System.out.println("in arg- car constructor ");
        this.carrier=carrier;
    }
    public Shipment(Consignment csm1,Carrier carrier){
        System.out.println("in arg both constructor ");
        this.consignment=csm1;   this.carrier=carrier;
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
