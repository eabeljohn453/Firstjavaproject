import java.util.Random;

class EvenThread extends Thread {
	private int num;
	public EvenThread(int num) {
		this.num=num;
	}
	
	public void run() {
		System.out.println("number --->>"+num);
		System.out.println("ARea"+num*num);	
	}
}

class OddThread extends Thread{
	private int num;
	public OddThread(int num) {
		this.num=num;
	}
	public void run() {
		System.out.println("number --->>"+num);
		System.out.println("volume"+num*num*num);	
	}
}

class RandomThread extends Thread{
    Random r =new Random();
    public void run() {
    	for(int i=0;i<=10;i++) {
    		int num = i;//r.nextInt(100);
    		if(num%2==0)
    		{
    			new EvenThread(num).start();
    		}else{
    			new OddThread(num).start();
    		}
    	}
    }
    
}


public class Multithreading {

	public static void main(String[] args) {
		RandomThread r=new RandomThread();
		r.start();
	}
}
		
