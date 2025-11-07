package com.abstraction;

import java.util.Scanner;

public class DoctorRecord extends MedicalRecord{

	String name;
	@Override
	public void updateRecord() {
		// TODO Auto-generated method stub
		System.out.println("The name of the doctor is updated");
		System.out.println("Name: "+name);
		
	}
	public static void main(String[] args) {
		DoctorRecord dr=new DoctorRecord();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		dr.name=s.next();
		dr.printRecordDetails();
		dr.updateRecord();
		
	}

}
