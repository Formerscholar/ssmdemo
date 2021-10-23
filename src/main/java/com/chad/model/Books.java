package com.chad.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Books implements Serializable {
	private int bookId;
	private String bookName;
	private int bookCounts;
	private String detail;
}
