import java.util.Scanner;
public class Tct {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("enter the operation");
		try {
			System.out.println("no 1");
			int a=sc.nextInt();
			System.out.println("no 2");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
	   catch(ArithmeticException e) {
		   System.out.println(e.getMessage());
	   }
		System.out.println("end of  the operation");  
	}

}
