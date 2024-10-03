package com.nit.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String bokkName;
    public Book(String bookName) {
    	this.bokkName = bookName;
    }
}
