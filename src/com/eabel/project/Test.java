package com.eabel.project;

import java.util.Scanner;

class Empolyee {
	private String name;
	private int age;
	private String address;
	private float salary;

	public void setname(String name) {
		this.name = name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void setaddress(String address) {
		this.address = address;

	}

	public void setsalary(float salary) {
		this.salary = salary;
	}

	public String getname() {
		return name;

	}

	public int getage() {
		return age;

	}

	public String getaddress() {
		return address;

	}

	public float getsalary() {
		return salary;

	}
}

	class Officer extends Empolyee {
		private String specialization;

		public void setspecialization(String specialization) {
			this.specialization = specialization;
		}

		public String getspecialization() {
			return specialization;

		}

	}

	class Manager extends Empolyee {
		private String specialization;

		public void setspecialization(String specialization) {
			this.specialization = specialization;
		}

		public String getspecialization() {
			return specialization;

		}
	}

	public class Test{
	  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  Officer o=new Officer();
	  System.out.println("Name");
	  o.setname(scan.nextLine());
	  System.out.println("age");
	  o.setage(scan.nextInt());
	  System.out.println("address");
	  o.setaddress(scan.nextLine());
	  System.out.println("salary");
	  o.setsalary(scan.nextInt());
	  System.out.println("specialization");
	  o.setspecialization(scan.nextLine());
	  
		System.out.println("name" +o.getname());
		System.out.println("age" +o.getage());
		System.out.println("address" +o.getaddress());
		System.out.println("salary" +o.getsalary());
		System.out.println("specialisation" +o.getspecialization());
  
  Manager M=new Manager();
  System.out.println("Name");
  M.setname(scan.nextLine());
  System.out.println("age");
  M.setage(scan.nextInt());
  System.out.println("address");
  M.setaddress(scan.nextLine());
  System.out.println("salary");
  M.setsalary(scan.nextInt());
  System.out.println("specialization");
  M.setspecialization(scan.nextLine());
	  
  
	System.out.println("name" +M.getname());
	System.out.println("age" +M.getage());
	System.out.println("address" +M.getaddress());
	System.out.println("salary" +M.getsalary());
	System.out.println("specialisation" +M.getspecialization());
}
}

