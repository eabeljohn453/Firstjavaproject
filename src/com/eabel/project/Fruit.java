package com.eabel.project;
import java.util.Scanner;
public class Fruit {

	public static void main(String[] args) {
		boolean run=true;
		while(run) {
	Scanner in=new Scanner(System.in);
	
	String fruits = in.next();
	
	switch (fruits)
	{
	case "Apple":
	System.out.println("good fruit");
	break;
	case "melon":
	System.out.println("super fruit");
	break;
	case "grapes":
	System.out.println("tasty fruit");
	break;
	case "exit":
		run=false;
		break;
	
	default:
	System.out.println("invalid input");
	}
	}
	
	}

}
