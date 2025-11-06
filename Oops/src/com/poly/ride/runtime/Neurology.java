package com.poly.ride.runtime;

import java.util.ArrayList;
import java.util.Scanner;

public class Neurology extends Psychiatry{
	public void getConsultationFee(int fee) 
	{
		System.out.println("The fee for the Neurology Doctor consulting is "+fee);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Neurology n=new Neurology();
		System.out.println("Enter the fee");
		int neurologyDoctorFee = sc.nextInt();
		n.getConsultationFee(neurologyDoctorFee);
		
		
		Doctor d=new Doctor();
		d.getConsultationFee(300);
		Doctor d1=new Surgeon();
		d1.getConsultationFee(1000);
		Doctor d2=new Psychiatry();
		d2.getConsultationFee(700);
		Doctor d3=new Neurology();
		d3.getConsultationFee(neurologyDoctorFee);
		
	}

}
