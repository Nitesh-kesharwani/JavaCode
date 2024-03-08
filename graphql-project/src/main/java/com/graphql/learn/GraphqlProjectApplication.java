package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class GraphqlProjectApplication implements CommandLineRunner {


    private final BookService bookService;


    public static void main(String[] args) {
        SpringApplication.run(GraphqlProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Book b1 = new Book();
        b1.setTitle("Complete Reference");
        b1.setDesc("For learning Java");
        b1.setPages(2000);
        b1.setPrice(5000);
        b1.setAuthor("James Gosling");


        Book b2 = new Book();
        b2.setTitle("Head First Java");
        b2.setDesc("For challenging Java");
        b2.setPages(100);
        b2.setPrice(8000);
        b2.setAuthor("Mughal Khalid");


        Book b3 = new Book();
        b3.setTitle("Head First Java");
        b3.setDesc("For challenging Java");
        b3.setPages(100);
        b3.setPrice(8000);
        b3.setAuthor("ABC");


        this.bookService.create(b1);
        this.bookService.create(b2);
        this.bookService.create(b3);

    }
}