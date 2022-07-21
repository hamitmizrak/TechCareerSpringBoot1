package com.hamitmizrak.composition;

import java.io.Serializable;
import java.util.List;

// 1
public class Writer implements Serializable {
	// serileştirme
	private static final long serialVersionUID = 1L;

	// nesne değişkeni
	private String writerName;

	// parametresiz constructor
	public Writer() {
	}

	// parametreli constructor
	public Writer(String writerName) {
		this.writerName = writerName;
	}

	// toString
	@Override
	public String toString() {
		return "Writer [writerName=" + writerName + "]";
	}

	// empati kurmak
	List<Book> bookList;

	// getter and setter
	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	// composition getter and setter
	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

}
