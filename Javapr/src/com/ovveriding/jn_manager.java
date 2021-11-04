package com.ovveriding;

public class jn_manager extends manager{
	@Override
	public void name(String name) {
		// TODO Auto-generated method stub
		super.name(name);
	}
	@Override
	public void name(int id) {
		// TODO Auto-generated method stub
		super.name(id);
	}
	@Override
	public void name(String address, int num) {
		// TODO Auto-generated method stub
		super.name(address, num);
	}
	public static void main(String[] args) {
		jn_manager r =new jn_manager();
		r.name("siran");
		r.name(122);
		r.name("pondy", 12);
	}

}
