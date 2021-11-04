package com.conditionstat;

public class amstrog {
	public static void main(String[] args) {
		int t=167;
		int a=t,b,c=0;
		while(a>0) {
			b=a%10;
			c=c+(b*b*b);
			a=a/10;
			
		}
		System.out.println(c);
		if (t==c) {
			System.out.println("amstrong number");
		}else {
			System.out.println("non amstrong number");
		}
	}

}
