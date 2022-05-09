package com.tarun.app.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fine {
    private Date creationDate;
    private double bookItemBarcode;
    private String memberId;
    private double amount;    
}