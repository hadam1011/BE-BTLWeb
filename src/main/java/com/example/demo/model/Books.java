	package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookid")
	private int bookcode;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "establish")
	private Date establish;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column (name = "description")
	private String description;
	
	@Column(name = "sold")
	private int sold;
	
	@Column(name = "totalpage")
	private int totalpage;
	
	@Column(name = "star")
	private int star;
	
	@Column(name = "comment")
	private int comment;
	
	public Books () {}

	public Books(int bookcode, String title, String author, String category, Date establish, String avatar,
			String description, int sold, int totalpage, int star, int comment) {
		this.bookcode = bookcode;
		this.title = title;
		this.author = author;
		this.category = category;
		this.establish = establish;
		this.avatar = avatar;
		this.description = description;
		this.sold = sold;
		this.totalpage = totalpage;
		this.star = star;
		this.comment = comment;
	}

	public int getBookcode() {
		return bookcode;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getEstablish() {
		return establish;
	}

	public void setEstablish(Date establish) {
		this.establish = establish;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}
	
}
