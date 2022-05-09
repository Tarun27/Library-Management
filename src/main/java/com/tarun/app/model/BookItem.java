package com.tarun.app.model;

import java.util.Date;

import com.tarun.app.constants.BookFormat;
import com.tarun.app.constants.BookStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookItem extends Book {

	    private String barcode;
	    private boolean isReferenceOnly; 
	    private Date borrowed;
	    private Date dueDate;
	    private double price;
	    private BookStatus status;
	    private BookFormat bookFormat;
	    private Date dateOfPurchase;
	    private Date publicationDate;
	    private Rack placedAt;
}
