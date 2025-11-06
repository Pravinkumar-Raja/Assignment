package com.abstraction;

public class EmergencyAppointment extends Appointment{

	int fee=700;
	@Override
	public void calculateFee() {

		System.out.println("The fee for the Emergency Appointment is "+fee);
	}
	
	public static void main(String[] args) {
		EmergencyAppointment ea=new EmergencyAppointment();
		ea.details();
		ea.calculateFee();
		
		Appointment a=new Appointment() {
			public void calculateFee()
			{
				System.out.println("The fee for Appointment is calculated based on the Time and Situation");
			}
		};
		a.calculateFee();
		
	}

}
