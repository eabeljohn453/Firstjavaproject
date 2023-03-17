package com.eabel.project;

public class BookRunner {

	public static void main(String[] args) {
	Book java = new Book(100);
	java.printPages();
	Book oop=new Book(60);    
 	oop.printPages();
 	oop.changePages(90);
 	oop.printPages();
	}

}

