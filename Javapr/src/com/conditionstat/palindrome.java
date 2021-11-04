package com.conditionstat;

import com.control_statement.whileloop;

public class palindrome {
	public static void main(String[] args) {
		int a=525;
		int s=a, b,c=0;
		while(a>0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
			
		}
		System.out.println(c);
		if (s==c) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("non palindrom");
		}
		
		
		
	}
}
	
	




