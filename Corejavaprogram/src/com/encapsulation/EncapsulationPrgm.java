package com.encapsulation;

public class EncapsulationPrgm {
private int id;
private String name;

//getter and setter method
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public static void main(String[] args){
	EncapsulationPrgm e1=new EncapsulationPrgm();
	e1.setId(101);
	e1.setName("TNS");
	System.out.println(e1.getId());
	System.out.println(e1.getName());
}


}
