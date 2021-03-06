package com.cogent.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.beans.factory.annotation.Value;

@Entity
//@DiscriminatorValue(value="CR")
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
public class CurrentStudent extends Student {
	private String course;
	private String timing;
	public CurrentStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentStudent(String sname, String semail, String course, String timing) {
		super( sname, semail);
		this.course = course;
		this.timing = timing;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	

}
