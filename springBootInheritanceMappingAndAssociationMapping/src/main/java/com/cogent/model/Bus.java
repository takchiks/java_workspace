package com.cogent.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "vId")
public class Bus extends Vehicle {
	private int seatingCapacity;

	public Bus(int engineNo, int chaseNo, String brand, String model, String fuelType, int seatingCapacity) {
		super(engineNo, chaseNo, brand, model, fuelType);
		this.seatingCapacity = seatingCapacity;
	}

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Bus [seatingCapacity=" + seatingCapacity + "]";
	}

}
