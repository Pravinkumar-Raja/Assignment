package com.encapsulation.clinic;

import java.util.Scanner;
	
public class PatientPayment {
	ClinicAccount c=new ClinicAccount();
	public void setAmount(int amount)
	{
		c.setAmount(amount);
	}
	public void deposit()
	{
		int dep=c.deposit();
		System.out.println("Amount "+dep+" deposited successfully to the account");
		System.out.println("Amount "+c.getAmount()+" deposited successfully to the account");
	}
	public void withdraw()
	{
		int with=c.withdraw();
		System.out.println("Amount "+with+" withdrawn successfully from the account");
		System.out.println("Amount "+c.getAmount()+" withdrawn successfully from the account");
	}
	public void viewBalance()
	{
		int view=c.balanceAmount();
		System.out.println("Balance Amount: "+view);
	}

	public static void main(String[] args) {
		int amount,balance,withdraw;
		Scanner s=new Scanner(System.in);
		
		PatientPayment p=new PatientPayment();
		
		int ch;
		do {
			System.out.println(".....Options you have.....");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.View Balance");
			System.out.println("4.Exit");
			System.out.println("Enter the choice");
			ch=s.nextInt();
			
			switch(ch)
			{
			case 1: System.out.println("Enter the amount");
			amount=s.nextInt();
			p.setAmount(amount);
				p.deposit();
			break;
			
			case 2: 
				System.out.println("Enter the amount");
				amount=s.nextInt();
				p.setAmount(amount);
				p.withdraw();
			break;
			
			case 3: p.viewBalance();
			break;
			
			case 4: System.exit(0);
			}
		}while(ch!=4);
	}
	

}
