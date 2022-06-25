package com.cogent.comparable;

import java.util.*;

public class Manager140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Doctor1> set1 = new TreeSet();
		set1.add(new Doctor1(1234, "Doc 1"));
		set1.add(new Doctor1(1235, "Doc 3"));
		set1.add(new Doctor1(1234, "Doc 1"));
		System.out.println(set1);

	}

}
