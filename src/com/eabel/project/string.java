package com.eabel.project;
import java.util.Scanner;
public class Fruits {

	
		

			public static void main(String[] args) {
			Scanner val=new Scanner(System.in);
			
			Fruits fruit = val.next();
					
			switch (fruit) {
			
			case "Apple":
			System.out.println("good fruit");
			break;
			case "melon":
			System.out.println("super fruit");
			break;
			case "Grapes":
			System.out.println("tasty fruit");
			break;
			default:
			System.out.println("invalid input");
			
			}
			
}

		}

	
