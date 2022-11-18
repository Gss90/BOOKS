package com.book.bookdir;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;
import java.util.Collection;
@Component
@Entity
public class bookdir implements Comparable<bookdir>{
	@Id
	private long bookid;
	private String bookname;
	private String author;
	private float price;
	public bookdir(long bookid, String bookname, String author, float price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	public bookdir() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the bookid
	 */
	public long getBookid() {
		return bookid;
	}
	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(long bookid) {
		this.bookid = bookid;
	}
	/**
	 * @return the bookname
	 */
	public String getBookname() {
		return bookname;
	}
	/**
	 * @param bookname the bookname to set
	 */
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "bookdir [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int compareTo(bookdir o) {
		if(this.price<o.price) {
			return -1;
		}
		else if(this.price>o.price) {
			return 1;
		}
		return 0;
	}
	

}
