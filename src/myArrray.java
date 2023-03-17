import java.util.Arrays;

public class myArrray {
	

	public static void main(String[] args) {
		num(1,2,6,9,7,7,7,7,7,7);
		num('a');
	}
		static void num(int ...v) {
			System.out.println(Arrays.toString(v));
		}
     
       static void num(char ...v) {
    	   System.out.println(Arrays.toString(v));
       }

}