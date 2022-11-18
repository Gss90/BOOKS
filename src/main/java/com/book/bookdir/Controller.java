package com.book.bookdir;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	Service ser;
	@GetMapping("bestbooks")
	public  ArrayList<bookdir> getbooks() {
		ArrayList<bookdir> b=ser.fetchbooks();
		return b;
	}
	@GetMapping("bestbooks/{author}")
	public String author(@PathVariable String author){
		ArrayList<bookdir> list=ser.byAuthor(author);
		return list.toString();
	}
	
	@GetMapping("bestbooks/sort")
	public ArrayList<bookdir> sortPrice() {
		ArrayList<bookdir> list =ser.price();
		return list;
	}



}
