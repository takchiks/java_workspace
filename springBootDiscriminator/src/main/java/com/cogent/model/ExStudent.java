package com.cogent.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue(value = "EX")
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
public class ExStudent extends Student {
	
	private String cemail;
	private String company;
	
	public ExStudent(String sname, String semail, String cemail, String company) {
		super( sname, semail);
		this.cemail = cemail;
		this.company = company;
	}
	public ExStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
