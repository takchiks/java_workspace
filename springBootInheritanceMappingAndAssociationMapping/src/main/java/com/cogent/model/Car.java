package com.cogent.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "vId")
public class Car extends Vehicle {
	
	private boolean havingSunRoof;

	public Car(int engineNo, int chaseNo, String brand, String model, String fuelType, boolean havingSunRoof) {
		super(engineNo, chaseNo, brand, model, fuelType);
		this.havingSunRoof = havingSunRoof;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isHavingSunRoof() {
		return havingSunRoof;
	}

	public void setHavingSunRoof(boolean havingSunRoof) {
		this.havingSunRoof = havingSunRoof;
	}

	@Override
	public String toString() {
		return "Car [havingSunRoof=" + havingSunRoof + "]";
	}
	
	

}
