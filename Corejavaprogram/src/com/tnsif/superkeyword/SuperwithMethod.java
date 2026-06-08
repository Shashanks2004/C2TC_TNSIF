package com.tnsif.superkeyword;
// demo for super method

class Payment1{
    void process() {
        System.out.println("processing payment using standard method");
    }
}

class Gpay extends Payment1{
    void process() {
        System.out.println("processing payment using gpay");
    }

    void completetransaction() {
        super.process();
        process();
    }
}

public class SuperwithMethod {
    public static void main(String[] args) {
        Gpay g = new Gpay();
        g.completetransaction();
    }
}
