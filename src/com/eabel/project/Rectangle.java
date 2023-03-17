package com.eabel.project;

import java.util.Scanner;

public class Rectangle {
	int length, breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int getArea() {

		return length * breadth;
		//System.out.println(area);
	}

	public static void main(String[] args) {
		System.out.println("Enter length and breadth");
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int breadth = in.nextInt();
		Rectangle s = new Rectangle(length, breadth);

		System.out.println("Area is "+s.getArea());
	}

}