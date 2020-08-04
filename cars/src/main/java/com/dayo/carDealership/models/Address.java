package com.dayo.carDealership.models;

import java.util.ArrayList;
import java.util.List;

import com.dayo.carDealership.utils.State;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Address {
	
public String street;
public String city;
public int zipcode;
public State state;


}
class AddressList{
	List<Address>addList;
	public AddressList() {
		addList = new ArrayList<>();
		//add 1
		Address add1 = new Address();
		add1.setStreet("Lanier Drive");
		add1.setCity("Statesboro");
		add1.setState(State.GA);
		add1.setZipcode(30458);
		addList.add(add1);
		
	//add 2
		Address add2 = new Address();
		add2.setStreet("Denver road");
		add2.setCity("Oklahoma city");
		add2.setState(State.OK);
		add2.setZipcode(730008);
		addList.add(add2);
	}
	public Address getAddress( int ID) {
		return addList.get(ID);
	}
	
}
