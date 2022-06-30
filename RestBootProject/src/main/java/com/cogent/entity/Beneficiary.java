package com.cogent.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Beneficiary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int beneficiaryId;
	private int beneficiaryAcNo;
	private Date beneficiaryAddedDate;
	private String approved;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer fromCustomer;
	
	public int getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public Customer getFromCustomer() {
		return fromCustomer;
	}
	public void setFromCustomer(Customer fromCustomer) {
		this.fromCustomer = fromCustomer;
	}
	public int getBeneficiaryAcNo() {
		return beneficiaryAcNo;
	}
	public void setBeneficiaryAcNo(int beneficiaryAcNo) {
		this.beneficiaryAcNo = beneficiaryAcNo;
	}
	public Date getBeneficiaryAddedDate() {
		return beneficiaryAddedDate;
	}
	public void setBeneficiaryAddedDate(Date beneficiaryAddedDate) {
		this.beneficiaryAddedDate = beneficiaryAddedDate;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public Beneficiary(Customer fromCustomer, int beneficiaryAcNo, Date beneficiaryAddedDate, String approved) {
		super();
		this.fromCustomer = fromCustomer;
		this.beneficiaryAcNo = beneficiaryAcNo;
		this.beneficiaryAddedDate = beneficiaryAddedDate;
		this.approved = approved;
	}
	public Beneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}
}
