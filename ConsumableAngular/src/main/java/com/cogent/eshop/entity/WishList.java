package com.cogent.eshop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class WishList {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int wid;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	List<Integer> products;

//	public int getWid() {
//		return wid;
//	}
//
//	public void setWid(int wid) {
//		this.wid = wid;
//	}

//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
//
//	public WishList( List<Product> products) {
//		super();
////		this.wid = wid;
//		this.products = products;
//	}

	@Id
	private Integer pid;
	
	
	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public WishList(Integer pid) {
		super();
		this.pid = pid;
	}


	public WishList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
