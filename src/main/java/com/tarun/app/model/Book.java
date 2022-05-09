package com.tarun.app.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	private String title;
	private String author;
	private String id;
	private String isbn;
	private String publisher;
	private String genre; 
	private String language;
    private int numberOfPages;
	private List<Author> authors;

	
}
