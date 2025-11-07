package com.encapsulation.clinic;

public class ClinicAccount {
	private int balance=0;
	private int amount;
	

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	public int deposit()
	{
		int cal=0;
	cal=this.getAmount();
	this.balance+=cal;
	return cal;
	}
	
	public int withdraw()
	{
		int cal=0;
	cal=this.getAmount();
	this.balance-=cal;
	return amount;
	}
	
	public int balanceAmount()
	{
		return this.balance;
		
	}

}
