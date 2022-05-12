package com.chainsys.unittest;

import com.chainsys.classandmethods.Book;

public class BookTester {
	public static void testBook() {
		Book firstBook=new Book("2 States");
		firstBook.setAuthorName("Chetan Bhagat");
		firstBook.setStory("Romance");
		firstBook.setYearOfRelease(2009);
		firstBook.setPlaceOfRelease("Delhi");
		System.out.println(firstBook.getBookName());
		System.out.println(firstBook.getAuthorName());
		System.out.println(firstBook.getStory());
		System.out.println(firstBook.getYearOfRelease());
		System.out.println(firstBook.getPlaceOfRelease());
	}

}
