package com.collection;

import java.awt.List;
import java.util.ArrayList;


public class list{
	public static void main(String[] args) {
		ArrayList<Object> s=new ArrayList<Object>();
		s.add(4324);
		s.add("siran");
		s.add("civil");
		s.add(1323);
		//size
		int size = s.size();
		System.out.println(size);
		//get
		Object get = s.get(1);
		System.out.println(get);
		//set
		Object set = s.set(1, 3);
		System.out.println(set);
		//remove
		Object remove = s.remove(0);
		System.out.println(remove);
		System.out.println(s);
		//indexof
		int indexOf = s.indexOf("siran");
		System.out.println(indexOf);
		//containns
		boolean contains = s.contains(1323);
		System.out.println(contains);
		ArrayList<Object>q=new ArrayList<Object>();
		q.add(647);
		q.add("d");
		//addall
		boolean addAll = q.addAll(s);
		System.out.println(addAll);
		System.out.println(q);
		//retainall
		boolean retainAll = q.retainAll(s);
		System.out.println(retainAll);
		System.out.println(q);
		//removeall
		boolean removeAll = q.removeAll(s);
		System.out.println(removeAll);
		System.out.println(q);
		
	}
	

}
