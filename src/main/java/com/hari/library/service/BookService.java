package com.hari.library.service;

import java.util.List;

import javax.validation.Valid;

import com.hari.library.entities.Book;

public interface BookService {
	
	void saveBook(@Valid Book book);
	List<Book> getAllBook();
	Book findBookById(String id);
	Book deleteBookById(String id);
	void updateBook(Book book);


	



}
