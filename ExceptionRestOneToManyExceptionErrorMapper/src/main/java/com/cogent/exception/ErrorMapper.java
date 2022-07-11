package com.cogent.exception;

import java.util.Date;

public class ErrorMapper {
	private int status;
	private String errorMsg;
	private Date date;
	public ErrorMapper(int status, String errorMsg, Date date) {
		super();
		this.status = status;
		this.errorMsg = errorMsg;
		this.date = date;
	}
	public ErrorMapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ErrorMapper [status=" + status + ", errorMsg=" + errorMsg + ", date=" + date + "]";
	}
	

}
