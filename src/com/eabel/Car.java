package com.eabel;

 class Car {
   String modelname;
   int model;
   int price;
 Car(String modelname,int model,int price) {
	   this.modelname=modelname;
	   this.model=model;
	   this.price=price;
	   
	   System.out.println(modelname+""+model+""+price);
   }
   public static void main(String[] args) {
	  Car q=new Car("BMW",111,111111);
	 
   }
   
 }