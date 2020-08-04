package com.dayo.carDealership.interfaces;

import com.dayo.carDealership.models.Car;
import com.dayo.carDealership.models.Card;

public interface IPaymentService {
public double upfront(Card card,Car car);
public double financing(Card card , Car car , double downPayment );
}
