package com.dayo.carDealership.models;

import java.util.ArrayList;
import java.util.List;

import com.dayo.carDealership.utils.Make;
import com.dayo.carDealership.utils.Model;
import com.dayo.carDealership.utils.Year;

public class Inventory {

	List<Car> listCar;

	public Inventory() {
		
		listCar = new ArrayList<>();
		// Car 1
		
		
		Car car1 = new Car();
		car1.setMakeName(Make.Toyota);
		car1.setMileage(135800);
		car1.setModelName(Model.Avalon);
		car1.setPrice(6200);
		car1.setYom(Year.Year2005);
		car1.setQuantity(5);
		car1.setId("A01");
		listCar.add(car1);
		// Car 2
		Car car2 = new Car();
		car2.setMakeName(Make.Ford);
		car2.setMileage(180000);
		car2.setModelName(Model.Explorer);
		car2.setPrice(4300);
		car2.setYom(Year.Year2008);
		car2.setQuantity(5);
		car2.setId("B02");
		listCar.add(car2);
		// Car 3
		Car car3 = new Car();
		car3.setMakeName(Make.Chevrolet);
		car3.setMileage(41000);
		car3.setModelName(Model.Aspen);
		car3.setPrice(12000);
		car3.setYom(Year.Year2011);
		car3.setQuantity(5);
		car3.setId("C03");
		listCar.add(car3);
		// car 4
		Car car4 = new Car();
		car4.setMakeName(Make.Honda);
		car4.setMileage(0);
		car4.setModelName(Model.Civic);
		car4.setPrice(22000);
		car4.setYom(Year.Year2018);
		car4.setQuantity(5);
		car4.setId("D04");
		listCar.add(car4);
		// Car 5
		Car car5 = new Car();
		car5.setMakeName(Make.Toyota);
		car5.setMileage(35800);
		car5.setModelName(Model.Camry);
		car5.setPrice(18200);
		car5.setYom(Year.Year2015);
		car5.setQuantity(5);
		car5.setId("E05");
		listCar.add(car5);
	   // Car 6
		Car car6 = new Car();
		car6.setMakeName(Make.Audi);
		car6.setMileage(75800);
		car6.setModelName(Model.Mustang);
		car6.setPrice(15200);
		car6.setYom(Year.Year2011);
		car6.setQuantity(5);
		car6.setId("F06");
		listCar.add(car6);
		//Car 7
		Car car7 = new Car();
		car7.setMakeName(Make.Bmw);
		car7.setMileage(800);
		car7.setModelName(Model.Accord);
		car7.setPrice(35200);
		car7.setYom(Year.Year2018);
		car7.setQuantity(5);
		car7.setId("H08");
		listCar.add(car7);
		//Car 8
		Car car8 = new Car();
		car8.setMakeName(Make.Nissan);
		car8.setMileage(195800);
		car8.setModelName(Model.PICKUP);
		car8.setPrice(600);
		car8.setYom(Year.Year2005);
		car8.setQuantity(5);
		car8.setId("J09");
		listCar.add(car8);
		
	}

	public void print() {
		for (int i = 0; i < listCar.size(); i++)
			System.out.println(listCar.get(i).toString());
	}
	public List <Car> roY(String yr) {
		List <Car>result = new ArrayList<>();
		for (Car b : listCar) {
			if (b.getYom().toString().equals(yr)) {
				result.add(b);
						}
		}
	return result;
	}
	public List<Car>roP(double pr,double pr1){
		List <Car>result = new ArrayList<>();
		for (Car k : listCar) {
			if (k.getPrice() >= pr && k.getPrice() <= pr1) {
				result.add(k);
			}
			
		}
		return result;
	}
	public List<Car>roM(double min,double max){
		List <Car>result = new ArrayList<>();
		for (Car x : listCar) {
			if (x.getMileage() >= min && x.getMileage() <= max) {
              result.add(x);
				

			}
		}
		return result;
	}

	public List<Car>roMa(String mr){
	List <Car>result = new ArrayList<>();	
	for(Car p : listCar) {
		if(p.getMakeName().toString().equals(mr)) {
			result.add(p);
		}
	}
	return result;
	}
public Car purchase(String purch) {
	Car result = new Car();
	for(Car b : listCar) {
		if(b.getId().equalsIgnoreCase(purch)) {
		result = b;
		return b;
		}
	}
	return result;
}
}




//method to filter car parameters
	
		
		
		

