package com.encapsulation.clinic;

import java.util.Scanner;

public class ProfileVerify {
	static DoctorProfile dp=new DoctorProfile();
	public void emailVerification() {
		
		boolean b=dp.verify();
		if(b==true)
		{
		System.out.println("Email "+dp.getEmail()+" verified successfully");
		}
		else
		{
			System.out.println("Invalid email id");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ProfileVerify pv=new ProfileVerify();
		System.out.println("Enter the email id");
		String email=s.next();
		dp.setEmail(email);
		pv.emailVerification();
		
	}

}
