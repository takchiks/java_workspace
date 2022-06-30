package com.cogent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.model.Book;
import com.cogent.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	@Override
	public void deleteBook(Integer bId) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(bId);;
	}

	@Override
	public Book getBook(Integer bId) {
		// TODO Auto-generated method stub
		return bookRepo.findById(bId).get();
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}
	
	

}
