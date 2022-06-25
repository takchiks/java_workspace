package com.arraylist.arr;

import java.util.ArrayList;

public class Manage129 {
	public static void main(String[] args) {
		ArrayList<Book129> arr = new ArrayList<Book129>();
		
		
	}
	

}
class Book129 implements Comparable{
	private String title;
	private String author;
	private double price;
	public Book129(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book129 [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public int compareTo(Object o) {
		
		return this.author.compareTo(((Book129)o).author);
		
	}
	
	
	
}
