package com.arraylist.arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Management118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laptop> laptops = new ArrayList<Laptop>();

		laptops.add(new Laptop(19, "vostro", "VOSTRO1234", 12323, 900));
		laptops.add(new Laptop(10, "DELL", "LATTITUDE1234", 12323, 900));
		laptops.add(new Laptop(12, "HP", "HP1234", 12323, 900));
		laptops.add(new Laptop(14, "APPLE", "APPLE1234", 12323, 900));
		

		find(laptops,"VOSTRO1234");
		delete(laptops, "VOSTRO1234");

		System.out.println(laptops);
		Collections.sort(laptops);
		System.out.println(laptops);

		

	}
	public static void find(List<Laptop> list, String model ){

		// find laptops
		Iterator<Laptop> it = list.iterator();

		while (it.hasNext()) {
			Laptop lap = it.next();
			if (lap.getlModel().equals(model)) {
				System.out.println("Found");
			}
		}
		
	}

	public static void delete(List<Laptop> list, String model ){
		//delete
		Iterator<Laptop> it = list.iterator();
		Object [] arr =  list.toArray();
		
		for (Object lapaz:arr){			
			Laptop lap =  (Laptop)lapaz;
			if (lap.getlModel().equals(model)){
				list.remove(list.indexOf(lap));
			}
		}
		
		//delete
//		Iterator<Laptop> it = list.iterator();
//		Laptop [] arr = (Laptop[]) list.toArray();
//		while (it.hasNext()) {
//			Laptop lap =  it.next();
//			if (lap.getlModel().equals(model)){
//				list.remove(list.indexOf(lap));
//				break;
//				
//			}
//		}
		
	}

}
