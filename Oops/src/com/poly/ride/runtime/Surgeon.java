package com.poly.ride.runtime;
import java.util.Scanner;
public class Surgeon extends Doctor{
	public void getConsultationFee(int fee) 
	{
		System.out.println("The fee for the Surgeon is "+fee);
	}
	public static void main(String[] args) {
		Surgeon s=new Surgeon();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fee");
		int surgeonFee=sc.nextInt();
		s.getConsultationFee(surgeonFee);
	}

}
