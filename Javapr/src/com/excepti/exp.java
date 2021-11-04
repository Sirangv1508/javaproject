package com.excepti;

import java.util.Scanner;

public class exp {
	public static void main(String[] args) {
//		String a= null;
//		System.out.println(a.length());
		try {
			int q=20, b=0;
			int c=q/b;
			System.out.println("result ="+c);
			
			
		} catch (ArithmeticException e) {
			System.out.println("cnt divide the number");
			// TODO: handle exception
		}//number formate exception
		try {
			int num=Integer.parseInt("fuyd");
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println("num formate");
			// TODO: handle exception
		}//array index bound of exception
		try {
			int a[]=new int [2];
			a[4]=9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bounds");
			// TODO: handle exception
		}//input mismatch
		Scanner sc=new Scanner(System.in);
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
	//string index out of bound	
		String a="2sasg";
		System.out.println(a.charAt(3));
		
	}
	

}
