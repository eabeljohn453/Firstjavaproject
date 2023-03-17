import java.util.*;
public class tokenss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number with spaces");
		StringTokenizer Token=new StringTokenizer(sc.nextLine()," ");
        int sum=0;
          while(Token.hasMoreTokens()) {
        	  String num=Token.nextToken();
        	  System.out.println(num);
        	  sum +=Integer.parseInt(num);
          }
        	  System.out.println("sum="+sum);
          
	
	
	
	
	
	}

}
