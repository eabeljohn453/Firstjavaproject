import java.util.Scanner;

public class Mmat {

	public static void main(String[] args) { 
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no of matrix in 1");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter the second matrix");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		if(c1==r2) {
		System.out.println("Enter the first matrix");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
				System.out.println("Enter the second matrix");
				for(int i=0;i<r2;i++) {
					for(int j=0;j<c2;j++) {
						b[i][j]=sc.nextInt();
					}
				}
				System.out.println("multi matrix");
				for(int i=0;i<r1;i++) {
					for(int j=0;j<c2;j++) {
						c[i][j]=0;
						for(int k=0;k<r2;k++) {
							c[i][j]=c[i][j]+a[i][k]*b[k][j];
							
						}
					}
				
				}
				for(int i=0;i<r1;i++) {
					for(int j=0;j<c1;j++) {
				System.out.println(a[i][j]+"\t");
					}
				}
				for(int i=0;i<r2;i++) {
					for(int j=0;j<c2;j++) {
				System.out.println(b[i][j]+"\t");
					}
					
			}
				System.out.println("multi matrix");
				for(int i=0;i<r1;i++) {		
					for(int j=0;j<c2;j++) {
				
					
					System.out.println(	c[i][j]+"\t");
							
					}}
				
		}
	
				else {
					System.out.println("invalid input");
				}
		
		
	}
	
}
	
