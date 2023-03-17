package com.eabel.project;

public class Bike {
     int speed;
     Bike(int speed){this.speed=speed;
    	 
     }
    void setSpeed(int speed){
 	   if(speed>0)
 	   
 		   this.speed=speed;7
 	 }
    	int getspeed(){
    		return this.speed;
    	}
    	
    	 
    	 void start() {
    		 System.out.println("Started");
    		 
    	 }
    	 
    	 void increasespeed(int howMuch)
    	 {
    		 
    		 this.speed+=howMuch;
    	 }
    	 void decreasespeed(int howMuch)
    	 { 
    		 
    		 this.speed-=howMuch;
    	 }
    	 
    	 
      
	 

    	 
}


