package co.publisher.main;

import co.book.Book;
import co.publisher.Publisher;

public class Main {
	
	public static void main(String[] args) {
		Publisher publisherObject=Publisher.getPublisherObject("Suraj", "Delhi", "PUB12345");
		Book bookObject=Book.getBookObject("Novel", "Pankaj", publisherObject, 800);
		
		if(bookObject==null && publisherObject==null) {
			System.out.println("Book Creation is failed due to invalid data");
		}
		else {
			System.out.println(publisherObject);
			System.out.println(bookObject);
		}
	}
}