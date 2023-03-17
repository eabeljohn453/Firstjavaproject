package com.eabel.project;
import java.util.scanner
public class Empolyee1 {
	private String name;
	private int age;
	private String address;
	private float salary;
   public void setname(String name)
   {
	   this.name=name;
   }
   public void setage(int age){
	   this.age=age;
   }
   public void setaddress(String address)
   {
	   this.address=address;
	
   }
   public void setsalary(float salary)
   {
	   this.salary=salary;
   }
   public void getname() {
	   return name;
	  
   }
   public void getage() {
	   return age; 
	   
   }
   public void getaddress() {
	   return address;
	   
   }
       public void getsalary() {
    	   return salary;
    	   
       }
       class officerextendsemployee{
    	   private String specialization;
    	   public void set specialization(String specialization) {
    		   this.specialization=specialization;
    	   }
	        public void get specialization() {
	        	return specialization;
	        	
	        }
	
	
	}
       class managerextendsemployee{
    	   private String specialization;
    	   public void set specialization(String specialization) {
    		   this.specialization=specialization;
    	   }
	        public void get specialization() {
	        	return specialization;
	        	
	        }
	}
  class Test{
	  Scanner sc=new Scanner(System.in);
	  officer O=new officer();
	  System.out.println("Name");
	  O.setname(sc.nextLine())
	  System.out.println("age");
	  O.setage(sc.nextInt())
	  System.out.println("address");
	  O.setaddress(sc.nextLine())
	  System.out.println("salary");
	  O.setsalary(sc.nextInt())
	  System.out.println("specialization");
	  O.setspecialization(sc.nextLine())
	  
		System.out.println("name" +O.getname());
		System.out.println("age" +O.getage());
		System.out.println("address" +O.getaddress());
		System.out.println("salary" +O.getsalary());
		System.out.println("specialisation" +O.getspecialization());
  }
       
  manager M=new manager();
  System.out.println("Name");
  M.setname(sc.nextLine())
  System.out.println("age");
  M.setage(sc.nextInt())
  System.out.println("address");
  M.setaddress(sc.nextLine())
  System.out.println("salary");
  M.setsalary(sc.nextInt())
  System.out.println("specialization");
  M.setspecialization(sc.nextLine())
  
	System.out.println("name" +M.getname());
	System.out.println("age" +M.getage());
	System.out.println("address" +M.getaddress());
	System.out.println("salary" +M.getsalary());
	System.out.println("specialisation" +M.getspecialization());
}     
       
}
       
}
