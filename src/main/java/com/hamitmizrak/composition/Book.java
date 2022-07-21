package com.hamitmizrak.composition;


import java.io.Serializable;

// N
public class Book implements Serializable {
	// serileştirme
	private static final long serialVersionUID = 1L;

	// nesne değişkeni
	private String bookName;

	// parametresiz constructor
	public Book() {
	}

	// parametreli constructor
	public Book(String bookName) {
		this.bookName = bookName;
	}

	// toString
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + "]";
	}

	// empati kurmak
	Writer writer;

	// getter setter
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	// composition getter and setter
	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

}
