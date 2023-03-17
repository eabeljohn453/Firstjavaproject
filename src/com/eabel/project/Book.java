package com.eabel.project;

public class Book {
	 int pages;
	Book(int pages){
	this.pages=pages;
	}
	
	public void changePages(int newPages) {
		this.pages = newPages;
	}
	
	public void printPages() {
		System.out.println(this.pages);
	}
	
		
	
	
}