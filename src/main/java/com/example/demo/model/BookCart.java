package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_cartid")
	private int book_cartid;
	
	@Column(name = "userid")
	private int userid;
	
	@Column(name = "bookid")
	private int bookid;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "purchase_time")
	private Date purchase;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "status")
	private String status;
	
	public BookCart() {}

	public BookCart(int book_cartid, int userid, int bookid, String title, Date purchase, int quantity, String status) {
		this.book_cartid = book_cartid;
		this.userid = userid;
		this.bookid = bookid;
		this.title = title;
		this.purchase = purchase;
		this.quantity = quantity;
		this.status = status;
	}

	public int getBook_cartid() {
		return book_cartid;
	}

	public void setBook_cartid(int book_cartid) {
		this.book_cartid = book_cartid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPurchase() {
		return purchase;
	}

	public void setPurchase(Date purchase) {
		this.purchase = purchase;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
}
