package com.arraylist.arr;

public class Laptop implements Comparable {
	private int lId;
	private String lBrand;
	private String lModel;
	private long ram;
	private long hdd;
	
	public Laptop() {
		super();
	}
	public Laptop(int lId, String lBrand, String lModel, long ram, long hdd) {
		super();
		this.lId = lId;
		this.lBrand = lBrand;
		this.lModel = lModel;
		this.ram = ram;
		this.hdd = hdd;
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlBrand() {
		return lBrand;
	}
	public void setlBrand(String lBrand) {
		this.lBrand = lBrand;
	}
	public String getlModel() {
		return lModel;
	}
	public void setlModel(String lModel) {
		this.lModel = lModel;
	}
	public long getRam() {
		return ram;
	}
	public void setRam(long ram) {
		this.ram = ram;
	}
	public long getHdd() {
		return this.hdd;
	}
	public void setHdd(long hdd) {
		this.hdd = hdd;
	}
	
	@Override
	public boolean equals(Object obj) {
		Laptop lp= (Laptop)obj;
		if(this.lId == lp.lId) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lBrand=" + lBrand + ", lModel=" + lModel + ", ram=" + ram + ", hdd=" + hdd
				+ "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Laptop l = (Laptop)o;
		
		return this.lBrand.compareTo(l.getlBrand());
	}
	
	
	
}
