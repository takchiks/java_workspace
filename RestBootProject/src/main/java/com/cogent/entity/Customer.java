package com.cogent.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String fullname;
	private String password;
	private String phone;
	private String pan;
	private String aadhar;
	private String secretAnswer; 
	private String pann;
    private byte[] aarchar;
	private String secretQuestion;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Transaction> transaction;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Beneficiary> beneficiaries;

}
