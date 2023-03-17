class Display{
	public synchronized void print(String msg) {
		System.out.println("["+msg);
	    try {
    	Thread.sleep(1000);
    }
    catch(Exception e) {
    	System.out.println(e.getMessage());
    }
      System.out.print("]");
}
}
class syncthread extends Thread {
	private Display d;
	private String msg;
	syncthread(Display d,String msg){
		this.msg=msg;
		this.d=d;
	}
	public void run() {
	   d.print(msg);

	}
}	
public class Test {

	public static void main(String[] args) {
		Display d=new Display();
	    syncthread t1=new syncthread(d,"Hello");
		syncthread t2=new syncthread(d,"world");
		t1.start();
		t2.start();
	}

}
