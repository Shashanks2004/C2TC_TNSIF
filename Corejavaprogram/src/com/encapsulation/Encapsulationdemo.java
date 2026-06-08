package com.encapsulation;

import com.tnsif.accessmodifiersprogrammes.Publicdemo;

public class Encapsulationdemo {
int serialnumber;
String name;
int age;

void demo() {
	System.out.println(serialnumber +" "+name+"  "+age);
}

public static void main(String[] args){
	Encapsulationdemo e=new Encapsulationdemo();
	e.serialnumber=9;
	e.name="Ramesh";
	e.age=56;
	e.demo();
}
}
