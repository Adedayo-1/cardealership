package com.dayo.carDealership.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reciept {
	public static void printreciept() {
		System.out.println("Car name" + "  " + "Car Make "+ "Quantity" + "  " + "Unit price"+ "    "+ "Item price");
	}
	
	
	public static void timeStamp() {  
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
		   System.out.println(dtf.format(now));
		  }  

}
