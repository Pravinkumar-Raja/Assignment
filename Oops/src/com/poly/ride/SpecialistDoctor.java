package com.poly.ride;

import java.util.Scanner;

public class SpecialistDoctor extends Doctor{
	public void getConsultationFee(int fee) 
	{
		System.out.println("The fee for the Specialist Doctor consulting is "+fee);
	}
	public static void main(String[] args) {
		SpecialistDoctor sd=new SpecialistDoctor();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fee");
		int specialDoctorFee = sc.nextInt();
		sd.getConsultationFee(specialDoctorFee);
		
	}

}
