package com.Package1.logic;

public class MyFirstJunit {
	private String message;

	   //Constructor
	   //@param message to be printed
	   public MyFirstJunit(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   

}
