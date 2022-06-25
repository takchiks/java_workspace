package com.cogent.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empEmail;
	private long empMobile;
	
	
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

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

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
