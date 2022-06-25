package com.cogent.comparator;

import java.util.*;

public class Manager140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Doctor1> set1 = new TreeSet(new SortingByName());
		set1.add(new Doctor1(1234, "Doc 1"));
		set1.add(new Doctor1(1235, "Doc 3"));
		set1.add(new Doctor1(1234, "Doc 4"));
		set1.add(new Doctor1(1234, "Doc 2"));
		System.out.println(set1);
		Set<Doctor1> set2 = new TreeSet(new SortingDoctorsByID());
		set2.add(new Doctor1(1234, "Doc 1"));
		set2.add(new Doctor1(1235, "Doc 3"));
		set2.add(new Doctor1(1231, "Doc 4"));
		set2.add(new Doctor1(1234, "Doc 2"));
		System.out.println(set2);

	}

}
