package com.cogent.map;


import java.util.*;
import java.util.Map.Entry;

public class Manager140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("America", "Washington DC");
		map.put("United Kingdom", "London");
		map.put("France", "Paris");
		map.put("Russ", "moscow");
		
		Set keySet = map.keySet();
		
		Iterator it = keySet.iterator();
		String key;
		System.out.println("KEY SET");
		
		while(it.hasNext()) {
			key = (String) it.next();
			System.out.println(key+" : "+ map.get(key));
		}
		
		Set entrySet = map.entrySet();
		
		Iterator iterator = entrySet.iterator();
		
		Entry entry;
		
		System.out.println("ENTRY SET");
		while(iterator.hasNext()) {
			entry = (Entry) iterator.next();

			System.out.println(entry.getKey()+" : "+ entry.getValue());
			
			
		}
		


	}

}
