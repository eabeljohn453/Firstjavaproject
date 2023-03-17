package com.eabel.project;

public class BiNumbers {

	
	int number1 , number2;
	BiNumbers(int number1, int number2){
		this.number1=number1;
		this.number2=number2;
	}
	public void setnumber1(int number1) {
		this.number1=number1;
		
	}
	public int getnumber1() {
		return this.number1;
	}
	public void setnumber2(int number2) {
		this.number2=number2;
		
	}
	public int getnumber2() {
		return this.number2;
	}
	int add() {
	int sum=number1+number2;
	return sum;
	}
	int multiply() {
		int product=number1*number2;
		return product;
		
	}
	void doubleval() {
		this.number1*=2;
		this.number2*=2;
	}

}