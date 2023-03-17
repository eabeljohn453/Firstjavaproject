package com.eabel.project;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
					Scanner val=new Scanner(System.in);
					boolean run = true;
					
					while(run) {
					
					String fruit = val.next();
							
					switch (fruit)
					{
						case "Apple":
							System.out.println("good fruit");
							break;
						case "melon":
							System.out.println("super fruit");
							break;
						case "Grapes":
							System.out.println("tasty fruit");
							break;
						case "exit" :
							System.out.println("exiting.....");
							run=false;
							break;
						default:
							System.out.println("invalid input");
					
					}
				}

	}


}

