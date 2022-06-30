package com.cogent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bId;
	private String bAuthor;
	private String bIsbn;
	private String bName;
	private String bTopic;
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public String getbIsbn() {
		return bIsbn;
	}
	public void setbIsbn(String bIsbn) {
		this.bIsbn = bIsbn;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbTopic() {
		return bTopic;
	}
	public void setbTopic(String bTopic) {
		this.bTopic = bTopic;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public Book(String bAuthor, String bIsbn, String bName, String bTopic) {
		super();
		this.bAuthor = bAuthor;
		this.bIsbn = bIsbn;
		this.bName = bName;
		this.bTopic = bTopic;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
