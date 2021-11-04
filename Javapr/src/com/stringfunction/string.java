package com.stringfunction;

public class string {
	public static void main(String[] args) {
		String w="welcome Siran";
		int length = w.length();
		System.out.println(length);
		boolean equals = w.equals("welcome Siran");
		System.out.println(equals);
		boolean equalsIgnoreCase = w.equalsIgnoreCase("WElcome siran");
		System.out.println(equalsIgnoreCase);
		String lowerCase = w.toLowerCase();
		System.out.println(lowerCase);
		String upperCase = w.toUpperCase();
		System.out.println(upperCase);
		boolean startsWith = w.startsWith("w");
		System.out.println(startsWith);
		boolean endsWith = w.endsWith("n");
		System.out.println(endsWith);
		boolean contains = w.contains("Siran");
		System.out.println(contains);
		int indexOf = w.indexOf("m");
		System.out.println(indexOf);
		int lastIndexOf = w.lastIndexOf("e");
		System.out.println(lastIndexOf);
		char charAt = w.charAt(0);
		System.out.println(charAt);
		String replace = w.replace("Siran", "civil");
		System.out.println(replace);
		String substring = w.substring(1,5);
		System.out.println(substring);
		
		boolean empty = w.isEmpty();
		System.out.println(empty);
		String[] split = w.split(" ");
		for (String string : split) {
			System.out.println(string);
					}
	
		
		String b="  siran  ";
		String trim = b.trim();
		System.out.println(trim);
		String concat = w.concat(b);
		System.out.println(concat);
		
		
		
		
	}

}
