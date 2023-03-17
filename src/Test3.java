import java.io.*;
public class Test3 {

	public static void main(String[] args) {
		try {
			FileReader fin=new FileReader("file.txt");
			FileWriter fout=new FileWriter("file.txt");
			int i;
			while((i=fin.read())!=-1) {
				fout.write(i);
			}
		fin.close();
		fout.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
          
	
	}
}
