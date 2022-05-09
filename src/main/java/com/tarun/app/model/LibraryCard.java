package com.tarun.app.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibraryCard {

	private String cardNumber;
	private Timestamp issuedAt;
	private boolean isActive; 
	private String barcode;

	
	
}
