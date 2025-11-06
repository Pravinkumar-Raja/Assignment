package com.poly.load;

public class Clinic {
	public void bookAppointment(String patientName) 
	{
		System.out.println("The name of the patient is "+patientName);
	}
	public void bookAppointment(String patientName,String doctorName) 
	{
		System.out.println("The Appointment Booked by "+patientName);
		System.out.println("The Doctor allotted for the patient is "+doctorName);
	}
	public void bookAppointment(String patientName,String doctorName,String Date) 
	{
		System.out.println("The Appointment Booked by "+patientName);
		System.out.println("The Doctor allotted for the patient is "+doctorName);
		System.out.println("The date of the appointment is "+Date);
	}
	public static void main(String[] args) {
		Clinic c=new Clinic();
		c.bookAppointment("Pravin");
		c.bookAppointment("Pravin", "Kumar");
		c.bookAppointment("Pravin", "Kumar", "06/11/2025");
	}
	
	

}
