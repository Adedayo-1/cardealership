package com.dayo.carDealership.models;

import java.util.Scanner;

import com.dayo.carDealership.utils.Make;
import com.dayo.carDealership.utils.Model;
import com.dayo.carDealership.utils.Year;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Car {
private Make makeName;
private Model modelName;
private int mileage;
private double price;
private Year yom;
private int quantity;
private String id;
public String toString() {
	return makeName.toString()+"    "+  getModelName().toString()+"  "+  mileage  +"  "+  price+"   " +  yom +"  "+id;
}
//method to display make
public void displayMake() {
	System.out.println("Please select one of the following makes: \n [1] Toyota \n [2] Ford \n [3] Honda \n [4] Chevrolet");
}//method to display year
public String displaypurchase() {
	return this.makeName +"  "+this.modelName+"  "+this.mileage+"  "+this.price;

}


}


 
	 
 
