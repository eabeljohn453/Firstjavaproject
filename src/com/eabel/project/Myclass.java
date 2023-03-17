package com.eabel.project;

public class Myclass {
    
 static void multi(int n,int k)

    {
	 if(k>10)
		 return ;
	 System.out.println(n+"*"+k+"="+n*k);
	 multi(n,k+1);
	 
    }
 public static void main(String[] args) {
	  int n=3;
	multi(n,1);
     }
}