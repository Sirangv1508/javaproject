package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class map {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "siran");
		m.put(1, "it");
		m.put(2, "bb");
		//size
		int size = m.size();
		System.out.println(size);
		//get
		String get = m.get(2);
		System.out.println(get);
		//keyset
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		//value
		Collection<String> values = m.values();
		System.out.println(values);
		//containskey
		boolean containsKey = m.containsKey(2);
		System.out.println(containsKey);
		//containsvalue
		boolean containsValue = m.containsValue("it");
		System.out.println(containsValue);
		//entryset
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		
	}

}
