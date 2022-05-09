package com.tarun.app.service;

import java.util.Date;
import java.util.List;

import com.tarun.app.model.Author;
import com.tarun.app.model.Book;

public interface SearchService {
	
    public List<Book> searchBook(String title, Author author, String genre, Date publishDate);
    
}
