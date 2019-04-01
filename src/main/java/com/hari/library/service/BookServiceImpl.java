package com.hari.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.library.entities.Book;
import com.hari.library.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	public void saveBook(Book book) {
		bookRepository.save(book);
	}
	
	@Override
	public List<Book> getAllBook(){
		return bookRepository.findAll();
	}
	
	@Override
	public Book findBookById(String id) {
		return bookRepository.findBookById(id);
	}
	
	public Book deleteBookById(String id) {
		bookRepository.deleteById(id);
		return null;
	}
	
	@Override
	public void updateBook(Book book) {
		bookRepository.save(book);
	}
}
	