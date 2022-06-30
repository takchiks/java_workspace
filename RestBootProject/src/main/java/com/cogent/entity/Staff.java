package com.cogent.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cogent.enums.Status;

public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;

	private String staffFullName;
	private String staffUserName;
	private String staffPassword;
	private Status status;

}
