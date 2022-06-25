package com.cogent.map;


import java.util.*;
import java.util.Map.Entry;

public class Manager141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement
		Map map = new TreeMap();
		map.put("America", "Washington DC");
		map.put("United Kingdom", "London");
		map.put("France", "Paris");
		map.put("Russ", "moscow");
		
		Set keySet = map.keySet();
		
		Iterator it = keySet.iterator();
		String key;
		System.out.println("\n\nKEY SET");
		
		while(it.hasNext()) {
			key = (String) it.next();
			System.out.println(key+" : "+ map.get(key));
		}
		
		Set entrySet = map.entrySet();
		
		Iterator iterator = entrySet.iterator();
		
		Entry entry;
		
		System.out.println("\n\nENTRY SET");
		while(iterator.hasNext()) {
			entry = (Entry) iterator.next();

			System.out.println(entry.getKey()+" : "+ entry.getValue());
			
			
		}
		


	}

}
