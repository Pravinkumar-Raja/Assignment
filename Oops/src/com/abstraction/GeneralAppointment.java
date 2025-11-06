package com.abstraction;

public class GeneralAppointment extends Appointment{

	int fee=500;
	@Override
	public void calculateFee() {

		System.out.println("The fee for General Appointment is "+fee);
	}
	
	public static void main(String[] args) {

		GeneralAppointment ga=new GeneralAppointment();
		ga.details();
		ga.calculateFee();

	}


}
