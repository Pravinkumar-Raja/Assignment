package com.abstraction.interf;

import java.util.Scanner;

public class UPIPayment implements PaymentGateway{

	static int amount;
	boolean b=false;
	@Override
	public void makePayment(String type) {

		if(type.equalsIgnoreCase("UPI"))
		{
			b=true;
			System.out.println("Your are ready to make the payment");
			System.out.println("Enter the 6 Digit pin");
		}
		else
		{
			b=false;
			System.out.println("Invalid Payment");
		}
			
		
	}

	@Override
	public void generateReceipt() {
		if(b=true)
		{
		System.out.println("Your Appointment Slot Confirmed");
		System.out.println("Payment type: UPI");
		System.out.println("Amount Paid: "+amount);
		}
		else
		{
			System.out.println("Sorry Use the UPI for payment");
		}
	}
	
	public static void main(String[] args) {
		
		UPIPayment upi=new UPIPayment();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the type of payment");
		String type=s.next();
		System.out.println("Enter the amount");
		amount=s.nextInt();
		upi.makePayment(type);
		upi.generateReceipt();
		
	}

}
