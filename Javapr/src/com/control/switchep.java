package com.control;

public class switchep{
	public static void main(String[] args) {
		String weeks= "sunday";
		switch (weeks) {
		case "monday":
			System.out.println("monday");
			
			break;
		case"sunday":
			System.out.println("sunday");
			break;

		default:
			System.out.println("the day is out of range");
			break;
		}
	}

}
