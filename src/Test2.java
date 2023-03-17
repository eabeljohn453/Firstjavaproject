abstract class sides{ 
	public abstract void noofsides();
}
class Triangle extends sides{
	public void noofsides() {
		System.out.println("3");
	}
}
class Rectangle extends sides{
	public void noofsides() {
		System.out.println("4");
	}
}
class pentagon extends sides{
	public void noofsides() {
		System.out.println("5");
	}
}
public class Test2 {

	public static void main(String[] args) {
	     Rectangle r=new Rectangle();
	     Triangle r1=new Triangle();
	     pentagon r2=new pentagon();
         r.noofsides();
         r1.noofsides();
         r2.noofsides();
	
	
	}

}
