package com.cogent.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empEmail;
	private long empMobile;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="empl_vehicles_table", joinColumns = @JoinColumn(name ="empId"))
	private List<Vehicle> vehicles;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String empEmail, long empMobile) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empMobile = empMobile;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public long getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(long empMobile) {
		this.empMobile = empMobile;
	}


	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empMobile="
				+ empMobile + ", address=" + address + "]";
	}
	
	

}
