package com.ovverloading;

public class name{
	public void name() {
		System.out.println();
			}
	public void name (String name) {
		System.out.println(name);
			}
	public void name(int id) {
		System.out.println(id);
		}
   public void name (String address,int num) {
	 System.out.println(address+" "+num);  
   }
   public static void main(String[] args) {
	name r=new name();
	
	r.name("rr");
	r.name("siran");
	r.name("21");
	r.name("pondy", 32);
}
}
