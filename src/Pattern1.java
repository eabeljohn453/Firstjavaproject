
public class Pattern1 {

	public static void main(String[] args) {
		generatePatter(3);
	}
  
	static void generatePatter(int n) {
	  for(int row=0;row<=2*n;row++) {
		  int totalcolumnInRow=row>n?2*n-row:row;
		  for(int col=0;col<=totalcolumnInRow;col++) {
			  
			  System.out.printf("*");
		  }
		  
		  System.out.println();
	  }
  
	}
}
