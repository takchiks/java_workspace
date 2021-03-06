package com.cogent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vId;
	private int engineNo;
	private int chaseNo;
	private String brand;
	private String model;
	private String fuelType;
	public Vehicle(int engineNo, int chaseNo, String brand, String model, String fuelType) {
		super();
		this.engineNo = engineNo;
		this.chaseNo = chaseNo;
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public int getChaseNo() {
		return chaseNo;
	}
	public void setChaseNo(int chaseNo) {
		this.chaseNo = chaseNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", engineNo=" + engineNo + ", chaseNo=" + chaseNo + ", brand=" + brand
				+ ", model=" + model + ", fuelType=" + fuelType + "]";
	}
	
	
	
	

}
