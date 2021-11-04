package com.singleinheritance;

public class jn_manager extends manager{
	public void name() {
		System.out.println("kanna");
		
	}
	@Override
	public void manager_id() {
		// TODO Auto-generated method stub
		super.manager_id();
	}
		
	
	public static void main(String[]args) {
		jn_manager w=new jn_manager();
		 w.managar_name();
		 w.manager_id();
		 w.name();
		

	}		
}
