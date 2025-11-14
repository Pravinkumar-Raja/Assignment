package com.example.exception;

import java.util.Scanner;

public class OnlinePaymentSystem {
	
	public void payment(String s)
	{
		if(s.length()<16)
		{
		try
		{
		System.out.println("Processing you payment......");
		
			throw new InvalidCardException();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
//			System.out.println(e.getMessage()); 
		}
		finally {
			System.out.println("Payment Failed..Retry next time");
		}
		}
		else
		{
			System.out.println("Payment Successfull");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		OnlinePaymentSystem ops=new OnlinePaymentSystem();
		System.out.println("Enter the Card_no for Payment");
		String s=sc.next();
		ops.payment(s);
	}

}
