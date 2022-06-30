package com.cogent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.model.Book;
import com.cogent.service.BookService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/{bId}")
	@PreAuthorize("hasRole('Student')")
	public ResponseEntity<Book> getBook(@PathVariable("bId") Integer bId){
		return new ResponseEntity<Book> (bookService.getBook(bId),HttpStatus.OK);
		
	}

}
