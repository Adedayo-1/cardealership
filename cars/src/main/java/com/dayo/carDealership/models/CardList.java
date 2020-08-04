package com.dayo.carDealership.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardList{
	Map<String, Card>cardList;
	public CardList() {
		cardList = new HashMap<>();
		AddressList addr = new AddressList();
		//Card 1
		Card card1 = new Card();
		card1.setBillingAddress(addr.getAddress(0));
		card1.setBalance(9700);
		card1.setCardNo("1234");
		cardList.put(card1.getCardNo(), card1);
		
		//card2
		Card card2 = new Card();
		card2.setBillingAddress(addr.getAddress(1));
		card2.setCardNo("2345");
		card2.setBalance(800000);
		cardList.put(card2.getCardNo(), card2);
	}
	public Card getCard(String CardNo) {

		return cardList.get(CardNo);
	}
	
}


