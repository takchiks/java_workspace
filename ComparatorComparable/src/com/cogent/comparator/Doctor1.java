package com.cogent.comparator;

public class Doctor1{
	private int dId;
	private String dname;
	public Doctor1(int dId, String dname) {
		super();
		this.dId = dId;
		this.dname = dname;
	}
	
	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Doctor1 [dId=" + dId + ", dname=" + dname + "]";
	}	
	

}

