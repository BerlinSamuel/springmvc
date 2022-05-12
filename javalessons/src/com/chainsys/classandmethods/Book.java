package com.chainsys.classandmethods;

public class Book {
	private final String bookName;
	private int yearOfRelease;
	private String authorName;
	private String story;
	private String placeOfRelease;
	public Book(String str) {
		this.bookName=str;
	}
	public String getBookName() {
		return bookName;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		story = story;
	}
	public String getPlaceOfRelease() {
		return placeOfRelease;
	}
	public void setPlaceOfRelease(String placeOfRelease) {
		this.placeOfRelease = placeOfRelease;
	}
}
