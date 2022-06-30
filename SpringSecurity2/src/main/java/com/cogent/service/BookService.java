package com.cogent.service;

import java.util.List;

import com.cogent.model.Book;

public interface BookService {
	public Book updateBook(Book book);
	public Book saveBook(Book book);
	public void deleteBook(Integer bId);
	public Book getBook(Integer bId);
	public List<Book> getAllBook();
}
