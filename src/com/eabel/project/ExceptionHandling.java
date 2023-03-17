package com.eabel.project;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		 method2();
	       method1();
	
		
	}
      public static void method1()
      {
    	
    	  System.out.println("method1 stop");
    	  
      }
       public static void method2() {
      try {
    	
    	
      
        System.out.println("method2 stop");
      }
      catch(Exception ex) {
    	  ex.printStackTrace();
      }
       }
      
}