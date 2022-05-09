package com.tarun.app.model;

import com.tarun.app.constants.AccountStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	private int id;

	private AccountStatus accountStatus;
	private LibraryCard libraryCard;
	private Person person;
	
}
