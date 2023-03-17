import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		int len = str.length();
		System.out.println("enter element to be search");
		char ch = sc.nextLine().charAt(0);
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("not found");
		} else {
			System.out.println("found" +count);
		}
	}
}
