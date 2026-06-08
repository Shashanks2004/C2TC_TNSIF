package com.tnsif.constructor;

class Userl{
	String name;
	int age;
	Userl(){
		name="Guest";
		age=5;
		System.out.println("Guest profile created");
	}
	Userl (String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("User created :"+name+" "+"Age:"+age);
	}
}

public class Constructordemo {
	public static void main(String[] args) {
		Userl u= new Userl();
		Userl u1= new Userl("Alice",25);
	}
}
