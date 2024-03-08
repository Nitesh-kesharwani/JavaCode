package com.graphql.learn.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.graphql.learn.dao.BookRepo;
import com.graphql.learn.entities.Book;
import com.graphql.learn.service.BookService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

	private final BookRepo bookRepo;

	@Override
	public Book create(Book book) {
		return this.bookRepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		return this.bookRepo.findAll();
	}

	@Override
	public Book get(int id) {
		return this.bookRepo.findById(id).orElseThrow(() -> new RuntimeException("No Book found"));
	}
}
