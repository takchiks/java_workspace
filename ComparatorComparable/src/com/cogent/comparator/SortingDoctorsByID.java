package com.cogent.comparator;

import java.util.Comparator;

public class SortingDoctorsByID implements Comparator<Doctor1> {
	@Override
	public int compare(Doctor1 o1, Doctor1 o2) {
		// TODO Auto-generated method stub
		
		return o1.getdId()-o2.getdId();
	}
	
	

}
