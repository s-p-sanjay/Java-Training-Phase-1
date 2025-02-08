package com.celcom.assignment1w;

import java.util.LinkedList;
import java.util.Scanner;

class Book {
	String title, author;
	final long isbn;

	public Book(String title, String author, long isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
}

class BookStore {
	LinkedList<Book> books = new LinkedList<>();

	void addBook(Book book) {
		for (Book b : books) {
			if (b.isbn == book.isbn) {
				System.out.println("isbn aleready available...");
				return;
			}
		}
		books.add(book);
		System.out.println("Book added successfully..");
	}

	void removeBook(long isbn) {
		for (Book b : books) {
			if (b.isbn == isbn) {
				System.out.println("Book " + b.title + " deleted successfully..");
				books.remove(b);
				return;
			}
		}
		System.out.println("Given book is not available..");
	}

	void showBooks() {
		if (!books.isEmpty()) {
			int i = 1;
			System.out.println("sno \t Book Name \t Author \t ISBN");
			for (Book b : books) {
				System.out.println(i + " \t " + b.title + " \t " + b.author + " \t " + b.isbn);
				i++;
			}
		} else {
			System.out.println("No books available..");
		}
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BookStore collection = new BookStore();
		int choice;
		do{
			System.out.println("1.show books \n2.add book \n3.remove book \n4.exit \nEnter --> ");
			choice = in.nextInt();
			if (choice == 1) {
				collection.showBooks();
			} else if (choice == 2) {
				System.out.println("Enter the title,author and isbn for the book : ");
				Book newBook = new Book(in.next(), in.next(), in.nextLong());
				collection.addBook(newBook);

			} else if (choice == 3) {
				System.out.println("Enter the isbn of a book : ");
				collection.removeBook(in.nextLong());
			} else if (choice == 4) {
				System.out.println("Thank you..!");
				break;
			} else {
				System.out.println("Invalid option ... ");
			}
		}while (choice != 4);
		in.close();
	}
}
