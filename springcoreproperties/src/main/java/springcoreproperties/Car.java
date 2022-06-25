package springcoreproperties;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	private int carNo;
	private String model;
	
	@Autowired
	private Engine engine;
	
	public Car(int carNo, String model) {
		super();
		this.carNo = carNo;
		this.model = model;
	}
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", model=" + model + "]";
	}

	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Travel has begun");
		System.out.println("Travel has ended");
		
		
	}
	
	

}
