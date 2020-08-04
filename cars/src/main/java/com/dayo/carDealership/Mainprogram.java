package com.dayo.carDealership;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.dayo.carDealership.models.Car;
import com.dayo.carDealership.models.Card;
import com.dayo.carDealership.models.CardList;
import com.dayo.carDealership.models.Inventory;
import com.dayo.carDealership.services.PaymentService;

public class Mainprogram 
{// List<Cars>listCar;

    public static void main( String[] args )
    {Inventory d = new Inventory();
    CardList  h = new CardList();
    PaymentService p = new PaymentService();
    	System.out.println("Welcome to Oni & sons car dealership");
    	System.out.println("\n Do you want to : \n [1] filter the cars in our inventory? \n [2] View all the cars ?");
    	Scanner answer = new Scanner(System.in);
    	String ans = answer.nextLine();
   if (ans.equalsIgnoreCase("2")) {
    	
    	d.print();
    	//System.out.println("")
   } else if(ans.equalsIgnoreCase("1")) {
	  // Inventory c = new Inventory();
	  // c.filter();
	   System.out.println("Please select the parameters you will like to filter by :"
	   		+ " \n[1]Make \n[2] Year \n[3]Price range \n[4] Mileage");
	   Scanner filt = new Scanner(System.in);
	   String f = filt.nextLine();
	   if (f.equalsIgnoreCase("1")) { // filter display make
			Car c = new Car();
			c.displayMake();
			Scanner mk = new Scanner(System.in);
			String mr = mk.nextLine();
			for(int i=0;i<d.roMa(mr).size();i++) {
						System.out.println(d.roMa(mr).get(i).toString());
			}
			
		} else if (f.equalsIgnoreCase("2")) { // filter year
			System.out.println("Please enter a specific year or a range of years");
			Scanner yea = new Scanner(System.in);
			String yr = yea.nextLine();
			
			for(int i=0;i<d.roY(yr).size();i++) {
				System.out.println(d.roY(yr).get(i).toString());
			}		
				
			}
		 else if (f.equalsIgnoreCase("3")) {
			System.out.println("Please enter a price range");
			System.out.println("Minimum: ");
			Scanner price = new Scanner(System.in);
			double pr = price.nextDouble();
			System.out.println("Maximum: ");
			Scanner price1 = new Scanner(System.in);
			double pr1 = price1.nextDouble();
			
			for(int i=0;i<d.roP(pr,pr1).size();i++) {
				System.out.println(d.roP(pr,pr1).get(i).toString());
			}
		}
		 else if (f.equalsIgnoreCase("4")) {

			// m.displayMile();
			System.out.println("Please enter a mileage range");
			System.out.println("Minimum: ");
			Scanner mile = new Scanner(System.in);
			double min = mile.nextDouble();
			System.out.println("Maximum: ");
			Scanner mile1 = new Scanner(System.in);
			double max = mile1.nextDouble();
			for (int i=0; i<d.roM(min,max).size(); i++) {
				System.out.println(d.roM(min, max).get(i).toString());
			}
		}
	
   }
   System.out.println("\n \n Please enter the ID of the car you would like to purchase :");
    Scanner pur = new Scanner(System.in);
    String purch = pur.nextLine();
    Car toBuy = d.purchase(purch);
    System.out.println(toBuy);
    System.out.println("\n \nHow would you like to pay : \n [1] Upfront \n [2] Financing option");
    Scanner paymt = new Scanner(System.in);
    String pay=paymt.nextLine();
    if (pay.equalsIgnoreCase("1")) {
    	System.out.println("Please enter your card number");
    	Scanner cardDetails = new Scanner(System.in);
    	String cd = cardDetails.nextLine();
    	Card c = h.getCard(cd);
    	
    	
    	if(c.getBalance()< toBuy.getPrice()) {
    		System.out.println("You have an insufficient account balance");
    	}else {
    		double balance = p.upfront(c, toBuy);
    	System.out.println("Your new balance is  : $" +balance);
    	}
    }else if (pay.equalsIgnoreCase("2")) {
    	System.out.println("Please enter your name");
    	Scanner CustomerName = new Scanner(System.in);
    	String cusName = CustomerName.nextLine();
    	System.out.println("Please enter your card number");
    	Scanner cardDetails = new Scanner(System.in);
    	String cd = cardDetails.nextLine();
    	Card c = h.getCard(cd);
    	System.out.println("Please enter the amount you'd like to pay now");
    	Scanner dp = new Scanner(System.in);
    	int downPaymt = dp.nextInt();
    	System.out.println("Please enter your credit score");;
    	 Scanner creditScore = new Scanner(System.in);
    	 int cScore = creditScore.nextInt();
    	 double balance= p.financeBreakdown(c, toBuy, downPaymt, cScore);
     	System.out.println("Your interest rate is "+100*p.getAPR()+"%" + "  " + "Your remaining balance is \n"+ balance);
    	 System.out.println("Please select the duration of payment \n [1] 36 months \n [2] 4"
    	 		+ "8 months \n [3] 72 months");
    	 Scanner dur = new Scanner(System.in);
    	 int duration = dur.nextInt();
    	 int duration1 = 0;
    	 if(duration == 1) { 
    		 duration1 = 36;
    	 }
    	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		   LocalDateTime now = LocalDateTime.now();
		  // System.out.println(dtf.format(now));
		 double monthpaymt = (balance/duration1);
		 System.out.println("Your monthly payement is :$"+Math.round(monthpaymt) + " and final payment will be due on "
		 		+ ": " +dtf.format(now.plusMonths(duration1)));
    	 
    	 System.out.println("Please enter your address details \n House number");
    	 Scanner housNo = new Scanner(System.in);
    	 String housenumber = housNo.next();
    	 System.out.println("Please enter street name");
    	 Scanner Strt = new Scanner(System.in);
    	 String Streetname = Strt.next();
    	 System.out.println("Enter city name :");
    	 Scanner cty = new Scanner(System.in);
    	 String city = cty.next();
    	 System.out.println(cusName+" "+" of "+housenumber+" "+Streetname+" "+city+" "+" is purchasing "+toBuy+" "+
    	 "today"+now+"and the final payment will be due on"+ dtf.format(now.plusMonths(duration1)));
    	 
    	 
    		
    	 
    	
    }
    }
    
}


