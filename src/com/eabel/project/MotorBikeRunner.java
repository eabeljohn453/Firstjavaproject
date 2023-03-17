package com.eabel.project;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
	    MotorBike bmw= new MotorBike();
       ducati.start();
       bmw.start();
       ducati.setspeed(80);
       bmw.setspeed(60);
	}

}
