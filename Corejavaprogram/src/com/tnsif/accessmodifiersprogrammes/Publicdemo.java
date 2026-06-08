package com.tnsif.accessmodifiersprogrammes;

public class Publicdemo {
	public int a=9;
	private String b="Google";
	//char i="s";
	protected int s = 7;	
	public void display(){
		System.out.println("Welcome");
	}
	
	public static void main(String[] args){
		Publicdemo p=new Publicdemo();
		System.out.println(p.a);
		System.out.println(p.b);	
		System.out.println(p.s);
	}

}
