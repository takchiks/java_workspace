package com.cogent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.model.Book;
import com.cogent.service.BookService;

@RestController
@RequestMapping("/librarian")
public class LibrarianController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/{bId}")
	@PreAuthorize("hasRole('Librarian')")
	public ResponseEntity<Book> getBook(@PathVariable("bId") Integer bId){
		return new ResponseEntity<Book> (bookService.getBook(bId),HttpStatus.OK);
		
	}
	@GetMapping
	@PreAuthorize("hasRole('Librarian')")
	public ResponseEntity<List<Book>> getAllBook(){
		return new ResponseEntity<List<Book>> (bookService.getAllBook(),HttpStatus.OK);
		
	}

	@DeleteMapping("/{bId}")
	@PreAuthorize("hasRole('Librarian')")
	public ResponseEntity deleteBook(@PathVariable("bId") Integer bId){
		bookService.deleteBook(bId); 
		return new ResponseEntity(HttpStatus.OK);
		
	}

	@PutMapping
	@PreAuthorize("hasRole('Librarian')")
	public ResponseEntity<Book> updateBook(@RequestBody Book book){
		return new ResponseEntity<Book> (bookService.saveBook(book),HttpStatus.OK);
		
	}
	
	@PostMapping
	@PreAuthorize("hasRole('Librarian')")
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		return new ResponseEntity<Book> (bookService.saveBook(book),HttpStatus.OK);
		
	}

}
