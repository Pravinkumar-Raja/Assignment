package com.abstraction.interf;

import java.util.Scanner;

public class CardPayment implements PaymentGateway{

	static int amount;

	@Override
	public void makePayment(String type) {
		
		if(type.equalsIgnoreCase("Card"))
		{
			System.out.println("Your are ready to make the payment");
			System.out.println("Enter the pin");
		}
		else
		{
			System.out.println("Invalid Payment");
		}
			
	}


	@Override
	public void generateReceipt() {
		
		System.out.println("Your Appointment Slot Confirmed");
		System.out.println("Payment Type : Card");
		System.out.println("Amount Paid: "+amount);
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the type of Payment");
		String type=s.next();
		System.out.println("Enter the amount");
		amount=s.nextInt();
		CardPayment cp=new CardPayment();
		cp.makePayment(type);
		cp.generateReceipt();
		
		
	}

}
