import java.util.Scanner;

class Employee {
	private String name;
	private String address;
	private double salary;
	private int age;
	private long phno;

	public void setname(String name) {
		this.name = name;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void setphno(long phno) {
		this.phno = phno;
	}

	public String getname() {
		return name;
	}

	public String getaddress() {
		return address;
	}

	public int getage() {
		return age;

	}

	public double printsalary() {
		return salary;
	}
}
	class Officer extends Employee {
		private String departement;
		private String specialisation;
		public void setdepartement(String departement) {
			this.departement = departement;
		}

		

		public void setspecialisation(String specialisation) {
			this.specialisation = specialisation;
		}

	

	public String getdepartement() {
		return  departement;
	}

	public String getspecialisation() {
		return  specialisation;
	}
	}
	class Manager extends Employee {

		private String departement;

		public void setdepartement(String departement) {
			this.departement = departement;
		}

		private String specialisation;

		public void setspecialisation(String specialisation) {
			this.specialisation = specialisation;
		}
		public String getdepartement() {
			return  departement;
		}

		public String getspecialisation() {
			return  specialisation;
	}
	
	}
   public  class Testemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Officer O = new Officer();
		System.out.println("Enter the name");
		O.setname(sc.nextLine());
		System.out.println("enter the address");
		O.setaddress(sc.nextLine());
		System.out.println(O.getname());
	}

     }

