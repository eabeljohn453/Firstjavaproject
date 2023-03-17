package com.eabel.project;
public class Area {
	
	
	double l;
	double b;
	double h;
	Box(double l,double b,double h){
	this.l=l;
	this.b=b;
	this.h=h;
	
	}
}


public class Main{
	public static void main(String[] args) {
	Area box=new Area(10,10,10);
	System.out.print(box.l +"" box.b +"" box.h +"");
}
}