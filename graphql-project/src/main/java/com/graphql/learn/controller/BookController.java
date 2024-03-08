package com.graphql.learn.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.learn.entities.Book;
import com.graphql.learn.service.BookService;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@RestController
//@RequestMapping("/books")
@Controller
@RequiredArgsConstructor
public class BookController {

	private final BookService bookService;

	// create
//    @PostMapping
	@MutationMapping("createBook")
	public Book create(@Argument BookInput book) {
		Book b = new Book();
		b.setTitle(book.getTitle());
		b.setDesc(book.getDesc());
		b.setPrice(book.getPrice());
		b.setAuthor(book.getAuthor());
		return this.bookService.create(b);
	}

	// get all
//    @GetMapping
	@QueryMapping("allBooks")
	public List<Book> get() {
		return this.bookService.getAll();
	}

	// get single
//    @GetMapping("/{id}")
	@QueryMapping("getBook")
	public Book getBook(@Argument int id) {
		return this.bookService.get(id);
	}
}

@Getter
@Setter
class BookInput {

	private String title;

	private String desc;

	private String author;

	private double price;

	private int pages;
}