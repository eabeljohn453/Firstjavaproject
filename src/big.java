import java.util.Scanner;
public class big {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	  
      int n;
      int arr[]=null;
      System.out.println("Enter the limit");
      n=sc.nextInt();
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      
     
      
    	  
      
    	  if(arr[i]<arr[i+1]) {
    		  System.out.println("big is"+arr[i]);
    	  }
    	  else {
    		  System.out.println("big is"+arr[i+1]);
    	  }
      }
}
}