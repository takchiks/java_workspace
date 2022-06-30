package com.cogent.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cogent.enums.TansactionType;

public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transationId;
    private Date date;
    private String reference;
    private double amount;
    private TansactionType tansactionType;
	public int getTransationId() {
		return transationId;
	}
	public void setTransationId(int transationId) {
		this.transationId = transationId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public TansactionType getTansactionType() {
		return tansactionType;
	}
	public void setTansactionType(TansactionType tansactionType) {
		this.tansactionType = tansactionType;
	}
	public Transaction(Date date, String reference, double amount, TansactionType tansactionType) {
		super();
		this.date = date;
		this.reference = reference;
		this.amount = amount;
		this.tansactionType = tansactionType;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	

}
