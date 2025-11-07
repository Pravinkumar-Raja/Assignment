package com.abstraction;

import java.util.Scanner;

public class PatientRecord {

	String name;
//	@Override
//	public void updateRecord() {
//		System.out.println("The name of the patient is updated");
//		System.out.println("Name: "+name);
//		
//	}
	
	public static void main(String[] args) {
		PatientRecord pr=new PatientRecord();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		pr.name=s.next();
		MedicalRecord mr=new MedicalRecord()
				{
			public void updateRecord()
			{
				System.out.println("The name of the patient is updated");
				
			}
				};
		mr.printRecordDetails();
		mr.updateRecord();
		
		
	}

}
