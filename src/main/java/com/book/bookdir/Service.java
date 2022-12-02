package com.book.bookdir;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Dao d;

	public ArrayList<bookdir> fetchbooks() {
		ArrayList<bookdir> b = d.fetchBooks();

		return b;
	}

	public ArrayList<bookdir> byAuthor(String author) {
		ArrayList<bookdir> list = d.fetchBooks();
		ArrayList<bookdir> list1 = new ArrayList<>();
		for (bookdir book : list) {
			if (book.getAuthor().equals(author)) {
				list1.add(book);

			}

		}

		return list1;

	}

	// sorting by price
	public ArrayList<bookdir> price() {
		ArrayList<bookdir> list = d.fetchBooks();
		Collections.sort(list);
		ArrayList<bookdir> l1 = list;

		return l1;
	}

	public String delete(int id) {

		return d.delete(id);
	}

	public String addBook(bookdir book) {

		return d.AddBook(book);
	}

	public String update(bookdir book) {
		return d.update(book);
	}

}
