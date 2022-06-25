package com.cogent.comparator;

import java.util.Comparator;

public class SortingByName implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(!(o1 instanceof Doctor1) || !(o2 instanceof Doctor1))
			return 0;
		Doctor1 d1 = (Doctor1)o1;
		Doctor1 d2 = (Doctor1)o2;
		return d1.getDname().compareTo(d2.getDname());
	}

}
