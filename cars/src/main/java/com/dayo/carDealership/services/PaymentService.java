package com.dayo.carDealership.services;

import com.dayo.carDealership.interfaces.IPaymentService;
import com.dayo.carDealership.models.Car;
import com.dayo.carDealership.models.Card;

import lombok.Getter;
@Getter
public class PaymentService implements IPaymentService{
	double APR;
public double upfront(Card card , Car car) {
	double bal = card.getBalance()-car.getPrice();
	card.setBalance(bal);
	return bal;
}
public double financing(Card card , Car car , double downPayment ) {  //Overloading
	upfront(card, car);                          
	double remBal = car.getPrice()- downPayment;
	return remBal;
}
public double financeBreakdown(Card card ,Car car, double downPayment, int creditScore) {
	double remBal = financing(card, car, downPayment);
	double percentage = (downPayment/car.getPrice()) * 100;
	if (percentage >0 && percentage <= 20 && creditScore>= 600)
	{ APR= 0.03;
		remBal+= APR*car.getPrice();
	}
	//return ("Your interest rate is "+100*APR+"%" + "  " + "Your remaining balance is \n"+ remBal );
	return remBal;
}
}
