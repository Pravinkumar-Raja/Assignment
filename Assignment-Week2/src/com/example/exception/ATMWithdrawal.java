package com.example.exception;

import java.util.Scanner;

public class ATMWithdrawal {
	static int balance=5000;
	public void withdraw(int amount) throws InsufficientFundException
	{
		if(amount>balance)
		{
			throw new InsufficientFundException();
		}
		else
		{
			System.out.println("Withdraw Successfull");
		}
	}
public static void main(String[] args) {
	int amount;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the amount");
	amount=s.nextInt();
	ATMWithdrawal atw=new ATMWithdrawal();
	try {
		atw.withdraw(amount);
	} catch (InsufficientFundException e) {
		
		e.printStackTrace();
	}
}
}
