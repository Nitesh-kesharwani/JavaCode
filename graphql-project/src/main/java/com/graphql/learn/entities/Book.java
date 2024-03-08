package com.graphql.learn.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project_books")
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

    private  String title;

    private String desc;

    private String author;

    private double price;

    private int pages;

}
