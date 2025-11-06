package com.poly.ride.runtime;

import java.util.Scanner;

public class Psychiatry extends Surgeon{

	public void getConsultationFee(int fee) 
	{
		System.out.println("The fee for the Psychiatric Doctor consulting is "+fee);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Surgeon d=new Psychiatry();
		System.out.println("Enter the fee");
		int doctorFee=sc.nextInt();
		d.getConsultationFee(doctorFee);
	}
}
