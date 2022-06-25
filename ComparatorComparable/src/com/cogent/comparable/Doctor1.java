package com.cogent.comparable;

public class Doctor1 implements Comparable {
	private int dId;
	private String dname;
	public Doctor1(int dId, String dname) {
		super();
		this.dId = dId;
		this.dname = dname;
	}
	
	@Override
	public String toString() {
		return "Doctor1 [dId=" + dId + ", dname=" + dname + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Doctor1 d = (Doctor1) o;
		return this.dId- d.dId;
	}
	
	
	

}
