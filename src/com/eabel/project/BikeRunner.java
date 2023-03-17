package com.eabel.project;

public class BikeRunner {

	public static void main(String[] args) {
		
     Bike ducati=new Bike(100);
     Bike bmw =new Bike(60);
     ducati.start();
     bmw.start();
   //  ducati.setSpeed(70);
     ducati.increasespeed(10);
     ducati.decreasespeed(10);
     System.out.println(ducati.getspeed());
     
     
   //  bmw.setSpeed(60);
     bmw.increasespeed(10);
     bmw.decreasespeed(10);
     System.out.println(bmw.getspeed());
	}

}
