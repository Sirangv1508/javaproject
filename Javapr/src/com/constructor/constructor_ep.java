package com.constructor;

public class constructor_ep {
	public constructor_ep() {
		System.out.println();
		
		
	}
	public constructor_ep(String name){
	//	System.out.println(name);
		this();
		
	}
	public constructor_ep(int age) {
		//System.out.println(age);
		this("ds");
	}
	public static void main(String[] args) throws Throwable {
		constructor_ep d=new constructor_ep();
		
		//constructor_ep a=new constructor_ep();
		//constructor_ep b=new constructor_ep("siran");
	//	constructor_ep c =new constructor_ep(23);
		//a.finalize();
		//b.finalize();
		//c.finalize();
	}

}
