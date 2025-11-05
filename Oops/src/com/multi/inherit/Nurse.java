package com.multi.inherit;

public class Nurse extends Staff{
	public void specialization()
	{
		System.out.println("The specialization of the staff is Nurse");
	}
	public static void main(String[] args) {
		Nurse n=new Nurse();
		n.addDetails();
		n.calculateSal(10);
		n.display();
		n.specialization();
		
	}

}
