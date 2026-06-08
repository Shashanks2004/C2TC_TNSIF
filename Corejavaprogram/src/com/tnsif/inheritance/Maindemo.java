package com.tnsif.inheritance;

class Father {
    int money = 90000;
    String car = "bmw";

    void drinking() {
        System.out.println("coffee");
    }
}

class Son extends Father {
    String cycle = "pink";

    void read() {
        System.out.println("java");
    }
}

public class Maindemo {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.money);
        System.out.println(s.car);
        System.out.println(s.cycle);
        s.drinking();
        s.read();
    }
}