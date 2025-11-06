package com.poly.ride;

import java.util.Scanner;

public class Doctor {
	public void getConsultationFee(int fee) 
	{
		System.out.println("The fee for the General Doctor consulting is "+fee);
	}
	
	public static void main(String[] args) {
		Doctor d=new Doctor();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the fee");
		int GerneralDoctorFee = s.nextInt();
		d.getConsultationFee(GerneralDoctorFee);
	}

}
