package com.cogent.eshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String name;
	private String brand;
	private String model;
	private int size;
	private double price;
	private String ratings;
	private String category;
	private String image;
	private String color;
	public Product(int id, String name, String brand, String model, int size, double price, String ratings,
			String category, String image, String color) {
		super();
		this.pid = id;
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.size = size;
		this.price = price;
		this.ratings = ratings;
		this.category = category;
		this.image = image;
		this.color = color;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return pid;
	}
	public void setId(int id) {
		this.pid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brand=" + brand + ", model=" + model + ", size=" + size
				+ ", price=" + price + ", ratings=" + ratings + ", category=" + category + ", image=" + image
				+ ", color=" + color + "]";
	}
	
	
	

}
